package Linkedin.dto.request;


import Linkedin.entity.Useres;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PostRequest {

    private Long id;

    private String content;


    private String username;

}