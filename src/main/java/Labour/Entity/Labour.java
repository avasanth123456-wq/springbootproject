package Labour.Entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="labour")
@Getter
@Setter
@Builder
public class Labour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String LabourName;

    private String Skill;

    private Double salary;

    private String status;

    public Labour() {
    }
    public Labour(Long id, String LabourName
            ,String Skill, Double salary,String status){

        this.id = id;
        this.LabourName = LabourName;
        this.Skill = Skill;
        this.salary = salary;
        this.status = status;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabourName() {
        return LabourName;
    }
    public void setLabourName(String labourName) {
        this.LabourName = labourName;
    }

    public String getSkill() {
        return Skill;
    }

    public void setSkill(String skill) {
        this.Skill= Skill;
    }

    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
