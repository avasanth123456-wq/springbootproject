package instagram.dto.requestdto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Data

public class UsersRequest {

    private String username;


    private  String email;

    private  String password;
}
