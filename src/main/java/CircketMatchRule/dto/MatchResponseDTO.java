package CircketMatchRule.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MatchResponseDTO {

    private String message;
    private int totalRuns;
    private int wickets;
    private String over;

    public MatchResponseDTO() {
    }

    public MatchResponseDTO(String message,
                            int totalRuns,
                            int wickets,
                            String over) {
        this.message = message;
        this.totalRuns = totalRuns;
        this.wickets = wickets;
        this.over = over;
    }

    public String getMessage() {
        return message;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public int getWickets() {
        return wickets;
    }

    public String getOver() {
        return over;
    }
}