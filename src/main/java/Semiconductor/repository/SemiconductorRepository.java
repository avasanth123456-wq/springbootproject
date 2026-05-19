package Semiconductor.repository;

import Semiconductor.entity.Semiconductor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SemiconductorRepository extends JpaRepository<Semiconductor,Long> {
}
