package instagram.entitylayer;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String imageUrl;


    private String caption;

    @ManyToOne

    private Users users;

    private  int likes;
}
