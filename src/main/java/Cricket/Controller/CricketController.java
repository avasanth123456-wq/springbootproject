package Cricket.Controller;

import Cricket.Service.CricketService;
import Cricket.dto.MatchRequestDTO;
import Cricket.dto.MatchResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/cricket")
public class CricketController {

    @Autowired

    private CricketService service;

    @PostMapping("/start")
    public CompletableFuture<String> startMatch(
            @RequestBody MatchRequestDTO dto) {
        return service.startMatch(dto);
    }

    @GetMapping("/all")
    public List<MatchResponseDTO> getAllMatches() {
        return service.getAllMatches();
    }
}