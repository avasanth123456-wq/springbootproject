package Hyderabad.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "metro_trains")
@Getter
@Setter
public class MetroTrain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trainNumber;

    private String sourceStation;

    private String destinationStation;


    private Integer availableSeats;


}
