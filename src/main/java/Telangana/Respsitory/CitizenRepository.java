package Telangana.Respsitory;

import Telangana.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepository extends JpaRepository<Citizen,Long> {
}
