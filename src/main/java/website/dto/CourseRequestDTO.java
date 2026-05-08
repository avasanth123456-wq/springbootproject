package website.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CourseRequestDTO {

    private Long id;


    private String title;


    private  String language;

    private int duration;
}
