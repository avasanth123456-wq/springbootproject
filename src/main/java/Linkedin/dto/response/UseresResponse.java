package Linkedin.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UseresResponse {
    private Long id;

    private String name;

    private String email;


    private String headline;
}
