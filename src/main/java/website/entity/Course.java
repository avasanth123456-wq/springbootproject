package website.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="course")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;


    private String title;


    private  String language;

    private int duration;
}
