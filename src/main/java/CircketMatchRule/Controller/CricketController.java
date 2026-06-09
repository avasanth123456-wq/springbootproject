package CircketMatchRule.Controller;

import CircketMatchRule.Service.CricketService;
import CircketMatchRule.dto.BallRequestDTO;
import CircketMatchRule.dto.MatchResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/cricket")

public class CricketController {

    @Autowired
    private CricketService service;

@GetMapping("/ball")
    public CompletableFuture<MatchResponseDTO> playBall(
            @RequestBody BallRequestDTO request) {

        return service.processBall(request);
    }

   /* @PostMapping("/ball")
    public String playBall(@RequestBody BallRequestDTO request) {
        return "Success";
    }*/
}