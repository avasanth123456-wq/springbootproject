package Employee.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class requestDTO {

    private String name;

    private String department;
}
