package Semiconductor.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class SemiconductorRequestDto {

    private String chipName;

    private String company;

    private String technologyNode;

    private  Double price;

    public SemiconductorRequestDto() {
    }

    public String getChipName() {
        return chipName;
    }

    public void setChipName(String chipName) {
        this.chipName = chipName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTechnologyNode() {
        return technologyNode;
    }

    public void setTechnologyNode(String technologyNode) {
        this.technologyNode = technologyNode;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
