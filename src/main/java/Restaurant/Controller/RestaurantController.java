package Restaurant.Controller;


import Restaurant.DTO.OrderRequestDTO;
import Restaurant.DTO.OrderResponseDTO;
import Restaurant.Service.RestaurantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    private final RestaurantService service;

    public RestaurantController(
            RestaurantService service) {
        this.service = service;
    }

    @PostMapping("/order")
    public ResponseEntity<OrderResponseDTO>
    placeOrder(
            @RequestBody
            OrderRequestDTO requestDTO) {

        return ResponseEntity.ok(
                service.placeOrder(requestDTO));
    }
}
