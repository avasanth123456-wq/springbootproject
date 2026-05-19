package Semiconductor.Service;

import Semiconductor.dto.SemiconductorResponseDto;
import Semiconductor.entity.Semiconductor;
import Semiconductor.repository.SemiconductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SemiconductorService {
    @Autowired

    private SemiconductorRepository repository;

    public SemiconductorResponseDto createSemiconductor(SemiconductorResponseDto dto){

         Semiconductor semiconductor = new Semiconductor();

         semiconductor.setChipName(dto.getChipName());
         semiconductor.setCompany(dto.getCompany());
         semiconductor.setTechnologyNode(dto.getTechnologyNode());
         semiconductor.setPrice(dto.getPrice());

         Semiconductor saved = repository.save(semiconductor);

         return new SemiconductorResponseDto(
                 saved.getId(),
                 saved.getChipName(),
                 saved.getCompany(),
                 saved.getTechnologyNode(),
                 saved.getPrice()
         );


    }


}
