package instagram.dto.responedto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UsersResponse {

    private  Long id;

    private String username;

    private  String email;
}
