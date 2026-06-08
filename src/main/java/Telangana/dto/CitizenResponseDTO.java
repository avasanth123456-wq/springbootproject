package Telangana.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class CitizenResponseDTO {

    private Long id;
    private String citizenName;
    private String district;
    private String schemeName;
    private String status;

    public CitizenResponseDTO() {
    }

    public CitizenResponseDTO(Long id,
                              String citizenName,
                              String district,
                              String schemeName,
                              String status) {
        this.id = id;
        this.citizenName = citizenName;
        this.district = district;
        this.schemeName = schemeName;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public void setCitizenName(String citizenName) {
        this.citizenName = citizenName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}