package Restaurant.Service;

import Restaurant.DTO.OrderRequestDTO;
import Restaurant.DTO.OrderResponseDTO;
import Restaurant.Entity.RestaurantOrder;
import Restaurant.Repository.RestaurantRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    private final RestaurantRepository repository;

    public RestaurantService(RestaurantRepository repository) {
        this.repository = repository;
    }

    @Async("restaurantExecutor")

    public void prepareFood(Long orderId){
        try {
            Thread.sleep(5000);

            RestaurantOrder order =
                    repository.findById(orderId).orElseThrow();

            order.setStatus("PREPARED");

            repository.save(order);

            System.out.println(
                    "Food Prepared For Order : "
                            + orderId);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public OrderResponseDTO placeOrder(
            OrderRequestDTO requestDTO) {

        RestaurantOrder order =
                new RestaurantOrder();

        order.setCustomerName(
                requestDTO.getCustomerName());

        order.setFoodItem(
                requestDTO.getFoodItem());

        order.setQuantity(
                requestDTO.getQuantity());

        order.setStatus("PROCESSING");

        RestaurantOrder saved =
                repository.save(order);

        prepareFood(saved.getId());

        return new OrderResponseDTO(
                saved.getId(),
                saved.getCustomerName(),
                saved.getFoodItem(),
                saved.getQuantity(),
                saved.getStatus()

        );

    }
}
