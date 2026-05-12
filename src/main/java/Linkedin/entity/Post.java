package Linkedin.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Post {

@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)

 private Long id;

 private String content;


 private String username;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Useres useres;


    public Useres getUsers() {

        return useres;
    }
}
