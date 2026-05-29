package Employee.dto;

import lombok.*;

@Data
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EmployeeResponseDTO {

    private Long id;

    private String names;

    private String department;

    private String message;

    public EmployeeResponseDTO(Long id, String names, String department, String message) {
        this.id = id;
        this.names = names;
        this.department = department;
        this.message = message;
    }
}
