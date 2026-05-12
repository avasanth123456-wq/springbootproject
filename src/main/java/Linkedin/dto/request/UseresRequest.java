package Linkedin.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder


public class UseresRequest {

    private Long id;

    private String name;

    private String email;


    private String headline;

}
