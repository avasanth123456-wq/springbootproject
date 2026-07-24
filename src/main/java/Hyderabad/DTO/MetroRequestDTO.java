package Hyderabad.DTO;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder

public class MetroRequestDTO {

    private String trainNumber;


    private String sourceStation;

    private String destinationStation;

    private Integer availableSeats;


}
