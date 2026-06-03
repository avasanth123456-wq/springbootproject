package Labour.dto;

import lombok.*;

@Getter
@Setter
@Builder
public class LabourResponseDTO {

    private Long id;
    private String labourName;
    private String skill;
    private Double salary;
    private String status;

    public LabourResponseDTO() {
    }

    public LabourResponseDTO(Long id,
                             String labourName,
                             String skill,
                             Double salary,
                             String status) {
        this.id = id;
        this.labourName = labourName;
        this.skill = skill;
        this.salary = salary;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getLabourName() {
        return labourName;
    }

    public String getSkill() {
        return skill;
    }

    public Double getSalary() {
        return salary;
    }

    public String getStatus() {
        return status;
    }
}