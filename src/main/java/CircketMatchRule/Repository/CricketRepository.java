package CircketMatchRule.Repository;

import CircketMatchRule.Entity.CricketMatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CricketRepository extends JpaRepository<CricketMatch,Long> {
}
