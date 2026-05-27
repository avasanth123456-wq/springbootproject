package Employee.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String department;

    public void setName(Object name) {
    }

    public void setDepartment(Object department) {
    }
}