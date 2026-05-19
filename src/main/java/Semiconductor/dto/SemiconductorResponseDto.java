package Semiconductor.dto;

import lombok.*;

@Getter
@Setter
@Builder

public class SemiconductorResponseDto {


    private Long id;

    private  String chipName;

    private String company;

    private String technologyNode;

    private  Double price;

    public SemiconductorResponseDto() {
    }

    public  SemiconductorResponseDto(Long id, String chipName,String company
            ,String technologyNode,Double price){

        this.id = id;
        this.chipName = chipName;
        this.company = company;
        this.technologyNode = technologyNode;
        this.price=price;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
