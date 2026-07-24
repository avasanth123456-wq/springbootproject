package Hyderabad.Service;

import Hyderabad.DTO.MetroRequestDTO;
import Hyderabad.DTO.MetroResponseDTO;
import Hyderabad.Repository.MetroRepository;
import Hyderabad.entity.MetroTrain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MetroService {

    @Autowired
    private MetroRepository repository;

    public MetroResponseDTO addTrain(
            MetroRequestDTO dto) {

        MetroTrain train = new MetroTrain();

        train.setTrainNumber(dto.getTrainNumber());
        train.setSourceStation(dto.getSourceStation());
        train.setDestinationStation(dto.getDestinationStation());
        train.setAvailableSeats(dto.getAvailableSeats());

        MetroTrain saved = repository.save(train);

        return new MetroResponseDTO(
                saved.getId(),
                saved.getTrainNumber(),
                "Train Added Successfully");
    }

    @Async
    public void bookTicket(Long trainId) {

        System.out.println(
                Thread.currentThread().getName()
                        + " Booking ticket for train "
                        + trainId);

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(
                Thread.currentThread().getName()
                        + " Ticket booked successfully");
    }
}