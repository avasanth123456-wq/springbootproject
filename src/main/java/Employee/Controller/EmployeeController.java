package Employee.Controller;

import Employee.Service.EmployeeService;
import Employee.dto.EmployeeRequestDTO;
import Employee.dto.EmployeeResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor

public class EmployeeController {

    @Autowired

    private EmployeeService employeeService;
    @PostMapping
    public EmployeeResponseDTO saveEmployee(
            @RequestBody EmployeeRequestDTO employeeRequestDTO) {

        return employeeService.saveEmployee(employeeRequestDTO);
    }
}
