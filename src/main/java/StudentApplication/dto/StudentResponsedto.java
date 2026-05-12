package StudentApplication.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentResponsedto {

    private Long id;


    private String name;


    private String course;

    private int age;
}
