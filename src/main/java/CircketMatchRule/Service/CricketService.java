package CircketMatchRule.Service;


import CircketMatchRule.Entity.CricketMatch;
import CircketMatchRule.Repository.CricketRepository;
import CircketMatchRule.dto.BallRequestDTO;
import CircketMatchRule.dto.MatchResponseDTO;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class CricketService {

    private final CricketRepository repository;

    public CricketService(CricketRepository repository){
        this.repository= repository;
    }
    @Async
    public CompletableFuture<MatchResponseDTO>processBall(BallRequestDTO dto){
        CricketMatch match = repository.findById(1L)
                .orElse(new CricketMatch(0,0,0,0));

        BallRequestDTO request = new BallRequestDTO();

        switch (request.getBallType()) {

            case "NORMAL":
                match.setTotalRuns(
                        match.getTotalRuns() + request.getRuns());

                match.setBalls(match.getBalls() + 1);
                break;

            case "NO_BALL":
                match.setTotalRuns(
                        match.getTotalRuns()
                                + request.getRuns() + 1);

                break;

            case "WIDE":
                match.setTotalRuns(
                        match.getTotalRuns()
                                + request.getRuns() + 1);

                // DOES NOT COUNT BALL
                break;

            case "WICKET":
                match.setWickets(
                        match.getWickets() + 1);

                match.setBalls(match.getBalls() + 1);
                break;
        }
        if (match.getBalls() == 6) {

            match.setOvers(match.getOvers() + 1);
            match.setBalls(0);
        }

        repository.save(match);

        String over =
                match.getOvers() + "." + match.getBalls();

        MatchResponseDTO response =
                new MatchResponseDTO(
                        "Ball Processed",
                        match.getTotalRuns(),
                        match.getWickets(),
                        over);

        return CompletableFuture.completedFuture(response);
    }


}
