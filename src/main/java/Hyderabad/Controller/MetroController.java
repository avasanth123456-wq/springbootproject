package Hyderabad.Controller;

import Hyderabad.DTO.MetroRequestDTO;
import Hyderabad.DTO.MetroResponseDTO;
import Hyderabad.Service.MetroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metro")
public class MetroController {

    @Autowired
    private MetroService service;

    @PostMapping("/train")
    public MetroResponseDTO addTrain(
            @RequestBody MetroRequestDTO dto) {

        return service.addTrain(dto);
    }

    @GetMapping("/book/{id}")
    public String bookTicket(
            @PathVariable Long id) {

        service.bookTicket(id);

        return "Booking Started";
    }
}
