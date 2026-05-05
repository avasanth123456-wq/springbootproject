package youtube.dto;


import lombok.*;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VideoRequest {


    private Long id;


    private String title;

    private String description;

    private String url;

    private Long views;


}
