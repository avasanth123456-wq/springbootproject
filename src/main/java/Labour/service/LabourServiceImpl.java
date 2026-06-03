package Labour.service;

import Labour.Entity.Labour;
import Labour.dto.LabourRequestDTO;
import Labour.dto.LabourResponseDTO;
import Labour.respsitory.LabourRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LabourServiceImpl implements  LabourService {

    private final LabourRepository repository;

    public LabourServiceImpl(
            LabourRepository repository) {
        this.repository = repository;
    }

    @Override
    public LabourResponseDTO registerLabour(
            LabourRequestDTO dto) {

        Labour labour = new Labour();

        labour.setLabourName(dto.getLabourName());
        labour.setSkill(dto.getSkill());
        labour.setSalary(dto.getSalary());
        labour.setStatus("PENDING");

        Labour saved = repository.save(labour);

        processApproval(saved.getId());

        return new LabourResponseDTO(
                saved.getId(),
                saved.getLabourName(),
                saved.getSkill(),
                saved.getSalary(),
                saved.getStatus());
    }

    @Async
    public void processApproval(Long id) {
        try {
            Thread.sleep(5000);

            Labour labour =
                    repository.findById(id).orElseThrow();

            labour.setStatus("APPROVED");

            repository.save(labour);

            System.out.println(
                    "Approved by Thread : "
                            + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<LabourResponseDTO> getAllLabours() {

        return repository.findAll()
                .stream()
                .map(l -> new LabourResponseDTO(
                        l.getId(),
                        l.getLabourName(),
                        l.getSkill(),
                        l.getSalary(),
                        l.getStatus()))
                .collect(Collectors.toList());
    }
}
