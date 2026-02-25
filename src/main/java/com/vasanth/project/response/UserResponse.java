package com.vasanth.project.response;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class UserResponse {
    private String name;

    private String mobile;

    private String email;

    private  String role;

    private String Emergencynumber;

}
