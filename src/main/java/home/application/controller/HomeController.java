package home.application.controller;


import home.application.dto.HomeDTO;
import home.application.request.HomeRequest;
import home.application.service.HomeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    private final HomeService service;

    public HomeController(HomeService service) {
        this.service = service;
    }


    @GetMapping
    public String homePage() {
        return "Welcome to Homepage 🚀";
    }

    @PostMapping
    public HomeDTO create(@RequestBody HomeRequest request) {
        return service.create(request);

    }
    @GetMapping("/all")
    public List<HomeDTO> getAll() {
        return service.getAll();
    }


    @GetMapping  ("/{id}")
    public HomeDTO getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // Delete
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Deleted Successfully";
    }
}