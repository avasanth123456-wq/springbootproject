package com.vasanth.project.request;


import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder


public class NameRequest {


    private String name;

    private String role;

    private String mobile;

    private String email;

    private String password;

    private int minLength;

}
