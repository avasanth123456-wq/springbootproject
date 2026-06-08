package Telangana.Service;


import Telangana.Respsitory.CitizenRepository;
import Telangana.dto.CitizenRequestDTO;
import Telangana.dto.CitizenResponseDTO;
import Telangana.entity.Citizen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class CitizenService {
    @Autowired

    private CitizenRepository repository;

    @Async
    public CompletableFuture<CitizenResponseDTO>
    registerCitizen(CitizenRequestDTO dto){

        Citizen citizen = new Citizen();

        citizen.setCitizenName(dto.getCitizenName());
        citizen.setDistrict(dto.getDistrict());
        citizen.setSchemeName(dto.getSchemeName());

        Citizen saved = repository.save(citizen);

        CitizenResponseDTO response =
                new CitizenResponseDTO(
                        saved.getId(),
                        saved.getCitizenName(),
                        saved.getDistrict(),
                        saved.getSchemeName(),
                        "REGISTERED"
                );

        return CompletableFuture.completedFuture(response);
    }

}
