package StudentApplication.Controller;


import StudentApplication.Service.StudentService;
import StudentApplication.dto.StudentRequestdto;
import StudentApplication.dto.StudentResponsedto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired

    private StudentService  service;

    public StudentController(StudentService service){

        this.service =service;
    }
    @PostMapping
    public StudentResponsedto createStudent(@RequestBody
                                                StudentRequestdto studentRequestdto){
        return service.createStudent(studentRequestdto);
    }
    @GetMapping
    public List<StudentResponsedto> getAllStudents() {
        return service.getAllStudents();
    }
}
