package example.authapp.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Data
public class LoginRequest {


    private String email;


    private  String password;
}
