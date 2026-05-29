package Cricket.Repository;

import Cricket.Enitity.CricketMatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CricketRepository  extends JpaRepository<CricketMatch,Long> {
}
