package com.vasanth.project.request;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class UserRequest{
    private String name;

    private String role;

    private String mobile;

    private String email;

    private String password;

}
