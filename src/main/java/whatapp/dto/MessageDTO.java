package whatapp.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessageDTO {

    private Long id;

    private Long senderId;

    private Long receiverId;

    private  String content;

    private LocalDateTime timestamp;
}
