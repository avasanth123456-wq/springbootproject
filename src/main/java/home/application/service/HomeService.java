package home.application.service;

import home.application.dto.HomeDTO;
import home.application.entity.Home;
import home.application.repository.HomeRepository;
import home.application.request.HomeRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HomeService {

    private final HomeRepository repository;


    public HomeService(HomeRepository repository){
        this.repository = repository;
    }
    public HomeDTO create(HomeRequest request){
        Home home = new Home();

        home.setTitle(request.getTitle());
        home.setDescription(request.getDescription());

        Home saved = repository.save(home);
        return mapToDTO(saved);
    }

    public List<HomeDTO> getAll(){
        return repository.findAll()
                .stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());

    }
    public HomeDTO getById(Long id) {
        Home home = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Home not found with id: " + id));

        return mapToDTO(home);
    }
    public void  delete(Long id){
        repository.deleteById(id);
    }

    private HomeDTO mapToDTO(Home home) {
        return  new HomeDTO(
                home.getId(),
                home.getTitle(),
                home.getDescription()

        );
    }
}