package Employee.Service;

import Employee.Entity.Employee;
import Employee.Repository.EmployeeRepository;
import Employee.dto.EmployeeRequestDTO;
import Employee.dto.EmployeeResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    @Autowired

    private EmployeeRepository employeeRepository;

    private ExecutorService executorService;

    public EmployeeResponseDTO saveEmployee(EmployeeRequestDTO
                                                    employeeRequestDTO) {

        Employee employee = new Employee();

        employee.setName(employeeRequestDTO.getNames());
        employee.setDepartment(employeeRequestDTO.getDepartment());

        executorService.submit(() -> {

            System.out.println(
                    Thread.currentThread().getName());

            employeeRepository.save(employee);

            System.out.println("Saved");
        });
        return new EmployeeResponseDTO(
                null,
                (String) employeeRequestDTO.getNames(),
                (String) employeeRequestDTO.getDepartment(),
                "Multithreading Started"
        );


    }

}

