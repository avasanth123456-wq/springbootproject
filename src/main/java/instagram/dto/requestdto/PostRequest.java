package instagram.dto.requestdto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PostRequest {

    private String imageUrl;

    private String  caption;

}
