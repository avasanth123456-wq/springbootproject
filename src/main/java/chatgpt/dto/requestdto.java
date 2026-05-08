package chatgpt.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class requestdto {


    private Long id;

    private String message;


    private String reply;
}
