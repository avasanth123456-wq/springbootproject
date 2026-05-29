package Cricket.dto;

import lombok.*;


@Getter
@Setter
@Builder

public class MatchResponseDTO {

    private Long id;
    private String teamA;
    private String teamB;
    private int scoreA;
    private int scoreB;
    private String winner;

    public MatchResponseDTO(Long id,
                            String teamA,
                            String teamB,
                            int scoreA,
                            int scoreB,
                            String winner) {

        this.id = id;
        this.teamA = teamA;
        this.teamB = teamB;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
        this.winner = winner;
    }

    public Long getId() {
        return id;
    }

    public String getTeamA() {
        return teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public int getScoreA() {
        return scoreA;
    }

    public int getScoreB() {
        return scoreB;
    }

    public String getWinner() {
        return winner;
    }
}
