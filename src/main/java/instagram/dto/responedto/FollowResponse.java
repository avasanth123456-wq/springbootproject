package instagram.dto.responedto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class FollowResponse {
    private Long id;

    private  String followerName;

    private String followingName;
}
