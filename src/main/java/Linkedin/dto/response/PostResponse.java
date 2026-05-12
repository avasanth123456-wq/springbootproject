package Linkedin.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class PostResponse {

    private Long id;

    private String content;

    private String username;
}
