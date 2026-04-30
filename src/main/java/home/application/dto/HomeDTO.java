package home.application.dto;

import lombok.*;


@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class HomeDTO {

    private Long id;

    private String title;

    private String description;

    public HomeDTO(Long id,String title,String description){

        this.id = id;

        this.title = title;

        this.description =description;

    }

    public Long getId(){return  id;}

    public String getTitle(){return  title;}

    public String getDescription(){return description;}


}
