package Linkedin.Service;

import Linkedin.dto.request.UseresRequest;
import Linkedin.dto.response.UseresResponse;
import Linkedin.entity.Useres;
import Linkedin.repository.UseresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseresService {
    @Autowired

    private UseresRepository repository;

    public UseresService(UseresRepository repository){
        this.repository=repository;
    }

    public UseresResponse register(UseresRequest request){
        Useres useres= new Useres();

        useres.setId(request.getId());
        useres.setName(request.getName());
        useres.setEmail(request.getEmail());
        useres.setHeadline(request.getHeadline());

        Useres saved = repository.save(useres);

        return  new UseresResponse(
                saved.getId(),
                saved.getName(),
                saved.getEmail(),
                saved.getHeadline()
        );
    }
}
