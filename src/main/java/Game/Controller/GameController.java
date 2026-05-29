package Game.Controller;

import Game.DTO.GameRequestDTO;
import Game.DTO.GameResponseDTO;
import Game.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")

public class GameController {

    @Autowired

    private GameService gameService;


    @PostMapping("/start")

    public GameResponseDTO startGame(
            @RequestBody GameRequestDTO dto){

        return gameService.startGame(dto);
    }
}
