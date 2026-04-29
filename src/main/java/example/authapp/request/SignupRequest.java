package example.authapp.request;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Builder
public class SignupRequest {

    private String username;

    private String email;

    private String password;


}

