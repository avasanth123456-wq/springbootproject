package example.authapp.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class UserDTO {

    private String username;

    private String email;

    private String password;
}
