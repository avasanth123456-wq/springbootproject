package com.vasanth.project.controller;

import com.vasanth.project.dto.NameDTO;
import com.vasanth.project.request.NameRequest;
import com.vasanth.project.response.NameResponse;
import com.vasanth.project.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/v1")
@CrossOrigin
public class NameController {
    @Autowired
    private NameService nameService;

    @RequestMapping(path = "/signupszfdszf", method = RequestMethod.POST)
    public ResponseEntity<String> saveUser(@RequestBody NameRequest request) {

        NameDTO nameDTO = NameDTO.builder()
                .name(request.getName())
                .role(request.getRole())
                .email(request.getEmail())
                .password(request.getPassword())
                .mobile(request.getMobile())
                .build();
        nameService.saveName(nameDTO);

        return ResponseEntity.ok("registere");
    }

    @RequestMapping(path = "/getAllNameByLengthbffc/{minLength}", method = RequestMethod.GET)
    public ResponseEntity<List<NameResponse>> getAllNameByLength(@PathVariable int minLength) {

        List<NameResponse> nameResponseList = nameService.getAllNameByLength(minLength);

            return ResponseEntity.ok(nameResponseList);
    }
}
