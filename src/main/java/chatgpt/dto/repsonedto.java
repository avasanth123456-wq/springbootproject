package chatgpt.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class repsonedto {

    private Long id;

    private String message;

    private String reply;


    public repsonedto(String reply) {
    }
}
