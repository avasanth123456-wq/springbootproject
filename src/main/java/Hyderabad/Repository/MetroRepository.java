package Hyderabad.Repository;

import Hyderabad.entity.MetroTrain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetroRepository
        extends JpaRepository<MetroTrain, Long> {
}