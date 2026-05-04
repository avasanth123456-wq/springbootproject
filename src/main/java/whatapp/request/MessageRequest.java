package whatapp.request;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MessageRequest {

    private Long id;

    private Long senderId;

    private Long receiverId;

    private String content;


    private LocalDateTime timestamp;



}
