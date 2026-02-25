package com.vasanth.project.service;

import com.vasanth.project.dto.UserDTO;
import com.vasanth.project.entity.User;
import com.vasanth.project.repository.UserRepository;
import com.vasanth.project.response.NameResponse;
import com.vasanth.project.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(UserDTO userDTO) {
        userDTO.setRandom("Random String");

        if (userDTO.getRandom().equals("Random String")) {
            User user = User.builder()
                    .name(userDTO.getName())
                    .email(userDTO.getEmail())
                    .role(userDTO.getRole())
                    .password(userDTO.getPassword())
                    .build();
            userRepository.save(user);
        }
    }

    public List<UserResponse> getAllUsers() {
        List<User> userList = userRepository.findAll();
        List<UserResponse> userResponseList = new ArrayList<>();
        for (User user : userList) {
            UserResponse userResponse = UserResponse.builder()
                    .name(user.getName())
                    .email(user.getEmail())
                    .mobile(user.getMobile())
                    .build();
            userResponseList.add(userResponse);
        }
        return userResponseList;
    }

   /* public List<NameResponse> getAllNameByLength(int minLength, int maxLength) {

        return userRepository.findAll()
                .stream()
                .filter(name -> name.getName() != null
                        && name.getName().length() >= minLength
                        && name.getName().length() <= maxLength)
                .map(name -> NameResponse.builder()
                        .name(name.getName())
                        .email(name.getEmail())
                        .mobile(name.getMobile())
                        .build())
                .toList();
    }
}*/

   public List<NameResponse> getAllNameByLength(int minLength) {

        return userRepository.findNamesWithLengthGreaterThanFiveNative(minLength)
                .stream()
                .map(name -> NameResponse.builder()
                        .name(name.getName())
                        .email(name.getEmail())
                        .mobile(name.getMobile())
                        .build())
                .toList();
    }
}

