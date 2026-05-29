package Game.Service;

import Game.DTO.GameRequestDTO;
import Game.DTO.GameResponseDTO;
import Game.Entity.Game;
import Game.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired

    private GameRepository gameRepository;

    @Async

    public void  playGame(GameRequestDTO dto){

        try{
            System.out.println(Thread.currentThread().getName());

            Thread.sleep(5000);

            Game game = new Game();

            game.setPlayerName(dto.getPlayerName());
            game.setGameName(dto.getGameName());
            game.setScore(dto.getScore());

            gameRepository.save(game);

            System.out.println(
                    dto.getPlayerName() + " completed game"
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public GameResponseDTO startGame(GameRequestDTO dto) {

        playGame(dto);

        return new GameResponseDTO(
                1L,
                "Game Started Successfully"
        );

       }
 }

