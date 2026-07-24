package Hyderabad.DTO;

import lombok.*;

@Getter
@Setter
@Data
@Builder
public class MetroResponseDTO {

    private Long id;
    private String trainNumber;
    private String message;

    public MetroResponseDTO() {
    }

    public MetroResponseDTO(Long id,
                            String trainNumber,
                            String message) {
        this.id = id;
        this.trainNumber = trainNumber;
        this.message = message;
    }


}
