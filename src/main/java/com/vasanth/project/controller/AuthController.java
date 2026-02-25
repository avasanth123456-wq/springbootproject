package com.vasanth.project.controller;

import com.vasanth.project.dto.UserDTO;
import com.vasanth.project.entity.User;
import com.vasanth.project.request.UserRequest;
import com.vasanth.project.response.NameResponse;
import com.vasanth.project.response.UserResponse;
import com.vasanth.project.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vasanth.project.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/v1")
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthService authService;

    @RequestMapping(path = "/signup", method = RequestMethod.POST)
    public ResponseEntity<String> saveUser(@RequestBody UserRequest request) {

        UserDTO userDTO = UserDTO.builder()
                .name(request.getName())
                .role(request.getRole())
                .email(request.getEmail())
                .password(request.getPassword())
                .mobile(request.getMobile())
                .build();
        authService.saveUser(userDTO);

        return ResponseEntity.ok("registere");
    }

    @RequestMapping(path = "/getAllUsers", method = RequestMethod.GET)
    public ResponseEntity<List<UserResponse>> getAllUser() {

        List<UserResponse> userResponseList = authService.getAllUsers();

        return ResponseEntity.ok(userResponseList);
    }

    @RequestMapping(path = "/getAllNameByLength/{minLength}", method = RequestMethod.GET)
    public ResponseEntity<List<NameResponse>> getAllNameByLength(@PathVariable int minLength) {

        List<NameResponse> nameResponseList = authService.getAllNameByLength(minLength);

        return ResponseEntity.ok(nameResponseList);
    }
}

   /* @RequestMapping(path = "/getAllNameByLength/{minLength}/{maxLength}", method = RequestMethod.GET)
    public ResponseEntity<List<NameResponse>> getAllNameByLength(
            @PathVariable int minLength,
            @PathVariable int maxLength)
    {

        List<NameResponse> nameResponseList = authService.getAllNameByLength(minLength,maxLength);

        return ResponseEntity.ok(nameResponseList);
    }

}*/


