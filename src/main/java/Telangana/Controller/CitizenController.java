package Telangana.Controller;

import Telangana.Service.CitizenService;
import Telangana.dto.CitizenRequestDTO;
import Telangana.dto.CitizenResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/telangana")
public class CitizenController {

    @Autowired

    private CitizenService service;

    @PostMapping("/register")
    public CompletableFuture<CitizenResponseDTO>
    registerCitizen(
            @RequestBody CitizenRequestDTO dto) {

        return service.registerCitizen(dto);
    }
}
