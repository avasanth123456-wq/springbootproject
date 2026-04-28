package com.vasanth.project.service;

import com.vasanth.project.dto.NameDTO;
import com.vasanth.project.entity.Name;
import com.vasanth.project.repository.NameRepository;
import com.vasanth.project.response.NameResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class NameService {

    @Autowired
    private NameRepository nameRepository;

    public void saveName(NameDTO nameDTO) {
        Name name = Name.builder()
                .name(nameDTO.getName())
                .email(nameDTO.getEmail())
                .role(nameDTO.getRole())
                .password(nameDTO.getPassword())
                .build();
        nameRepository.save(name);
    }

    public List<NameResponse> getAllNameByLength(int minLength) {

        return nameRepository.findAll()
                .stream()
                .filter(name -> name.getName() !=null
                        && name.getName().length() >= minLength)
                .map(name -> NameResponse.builder()
                        .name(name.getName())
                        .email(name.getEmail())
                        .mobile(name.getMobile())
                        .build())
                .toList();
    }
}