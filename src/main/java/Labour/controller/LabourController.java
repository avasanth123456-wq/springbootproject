package Labour.controller;



import Labour.dto.LabourRequestDTO;
import Labour.dto.LabourResponseDTO;
import Labour.service.LabourService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/labour")
public class LabourController {

    private final LabourService service;

    public LabourController(
            LabourService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public LabourResponseDTO register(
            @RequestBody LabourRequestDTO dto) {

        return service.registerLabour(dto);
    }

    @GetMapping("/all")
    public List<LabourResponseDTO> getAll() {
        return service.getAllLabours();
    }
}