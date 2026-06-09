package CircketMatchRule.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BallRequestDTO {

    private String ballType;
    private int runs;

    public BallRequestDTO() {
    }

    public String getBallType() {
        return ballType;
    }

    public void setBallType(String ballType) {
        this.ballType = ballType;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }
}