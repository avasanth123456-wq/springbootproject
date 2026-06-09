package CircketMatchRule.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class CricketMatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private int totalRuns;
    private int wickets;
    private int balls;
    private int overs;

    public CricketMatch() {
    }
    public CricketMatch(int totalRuns, int wickets, int balls, int overs) {
        this.totalRuns = totalRuns;
        this.wickets = wickets;
        this.balls = balls;
        this.overs = overs;
    }

    public Long getId() {
        return id;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

        public void setTotalRuns(int totalRuns) {
            this.totalRuns = totalRuns;
        }

        public int getWickets() {
            return wickets;
        }

        public void setWickets(int wickets) {
            this.wickets = wickets;
        }

        public int getBalls() {
            return balls;
        }
    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getOvers() {
        return overs;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }
}
