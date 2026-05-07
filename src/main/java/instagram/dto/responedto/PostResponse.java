package instagram.dto.responedto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PostResponse {

    private Long id;

    private String imageUrl;

    private  String caption;

    private int likes;

    private String username;
}
