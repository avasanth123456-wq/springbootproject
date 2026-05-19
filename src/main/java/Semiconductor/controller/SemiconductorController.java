package Semiconductor.controller;

import Semiconductor.Service.SemiconductorService;
import Semiconductor.dto.SemiconductorResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/semiconductor")
public class SemiconductorController {
    @Autowired

    private SemiconductorService service;

    @PostMapping
    public SemiconductorResponseDto createSemiconductor(
            @RequestBody SemiconductorResponseDto dto){
        return service.createSemiconductor(dto);
    }


}
