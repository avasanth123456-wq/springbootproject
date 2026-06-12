package Restaurant.Repository;

import Restaurant.Entity.RestaurantOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<RestaurantOrder,Long> {
}
