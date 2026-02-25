package com.vasanth.project.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class NameDTO implements Serializable {


    private String name;

    private String role;

    private String mobile;

    private String email;

    private String password;

    private int minLength;

}
