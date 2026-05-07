package instagram.dto.requestdto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class FollowRequest {

    private Long followerId;

    private  Long followingId;
}
