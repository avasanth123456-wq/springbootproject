package home.application.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="home")
@Builder
@AllArgsConstructor
@Getter
@Setter
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;


    private String title;

    private String description;


    public Home(){}


    public  Home(String title,String description){
        this.title = title;
        this.description = description;
    }

    public Long getId(){return  id;}

    public String getTitle(){return  title;}
    public void setTitle(String title){this.title=title;}


    public String getDescription(){return description;}
    public void  setDescription(String description){this.description =description;}
}
