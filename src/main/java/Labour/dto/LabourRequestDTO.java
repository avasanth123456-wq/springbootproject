package Labour.dto;

import lombok.*;

@Getter
@Setter

public class LabourRequestDTO {


        private String labourName;
        private String skill;
        private Double salary;

        public LabourRequestDTO() {
        }

        public String getLabourName() {
            return labourName;
        }

        public void setLabourName(String labourName) {
            this.labourName = labourName;
        }

        public String getSkill() {
            return skill;
        }

        public void setSkill(String skill) {
            this.skill = skill;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }
    }

