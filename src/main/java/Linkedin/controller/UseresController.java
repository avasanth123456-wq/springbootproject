package Linkedin.controller;

import Linkedin.Service.UseresService;
import Linkedin.dto.request.UseresRequest;
import Linkedin.dto.response.UseresResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/useres")
public class UseresController {
    @Autowired

    private UseresService service;


    public UseresController(UseresService service){
        this.service=service;
    }
    @PostMapping
    public UseresResponse register(@RequestBody UseresRequest request){

        return  service.register(request);
    }
}
