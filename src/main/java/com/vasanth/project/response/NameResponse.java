package com.vasanth.project.response;


import lombok.*;


@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder


public class NameResponse {
    private String name;

    private String mobile;

    private String email;

    private  String role;

    private int minlength;

}
