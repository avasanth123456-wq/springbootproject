package Cricket.Service;

import Cricket.Enitity.CricketMatch;
import Cricket.Repository.CricketRepository;
import Cricket.dto.MatchRequestDTO;
import Cricket.dto.MatchResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Service
public class CricketService {

    @Autowired

    private CricketRepository repository;

    private Random  random = new Random();

    @Async("cricketExecutor")

    public CompletableFuture<String> startMatch (MatchRequestDTO dto){

        CricketMatch match = new CricketMatch();

        match.setTeamA(dto.getTeamA());
        match.setTeamB(dto.getTeamB());


        int scoreA = 0;
        int scoreB  =0;

        try {


            int over;
            for (over = 1; over <= 20; over++) ;

            scoreA += random.nextInt(25);
            scoreB += random.nextInt(25);

            System.out.println(
                    Thread.currentThread().getName()
                            + "Over :" + over
                            + " | " + dto.getTeamA() + ": " + scoreA
                            + " | " + dto.getTeamB() + ": " + scoreB
            );

            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        match.setScoreA(scoreA);
        match.setScoreB(scoreB);

        if (scoreA > scoreB) {
            match.setWinner(dto.getTeamA());
        } else if (scoreB > scoreA) {
            match.setWinner(dto.getTeamB());
        } else {
            match.setWinner("DRAW");
        }
         repository.save(match);


        return CompletableFuture.completedFuture(
                "Match Completed Successfully"
        );

    }

    public List<MatchResponseDTO> getAllMatches(){
        return repository.findAll()
                .stream()
                .map(match -> new MatchResponseDTO(
                        match.getId(),
                        match.getTeamA(),
                        match.getTeamB(),
                        match.getScoreA(),
                        match.getScoreB(),
                        match.getWinner()
                ))
                .collect(Collectors.toList());
    }
}
