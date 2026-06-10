package CircketMatchRule.Controller;

import CircketMatchRule.Service.CricketService;
import CircketMatchRule.dto.BallRequestDTO;
import CircketMatchRule.dto.MatchResponseDTO;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;



@RestController
@RequestMapping("/cricket")
public class CricketController {

    private final CricketService cricketService;

    public CricketController(CricketService cricketService) {
        this.cricketService = cricketService;
    }

    @GetMapping("/test")
    public String test() {
        return "Cricket API Working";
    }

    @PostMapping("/ball")
    public CompletableFuture<MatchResponseDTO> playBall(
            @RequestBody BallRequestDTO request) {

        return cricketService.processBall(request);
    }
}