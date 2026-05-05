package youtube.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class VideoResponse {

    private Long id;

    private String title;

    private String description;

    private String url;

    private Long views;
}
