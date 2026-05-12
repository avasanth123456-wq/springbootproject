package StudentApplication.Service;

import StudentApplication.Repository.StudentRepository;
import StudentApplication.dto.StudentRequestdto;
import StudentApplication.dto.StudentResponsedto;
import StudentApplication.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    @Autowired

    private StudentRepository repository;


    public StudentService(StudentRepository repository){
        this.repository=repository;
    }

    public StudentResponsedto createStudent(StudentRequestdto studentRequestdto){

        Student student = new Student();

        student.setId(studentRequestdto.getId());
        student.setName(studentRequestdto.getName());
        student.setCourse(studentRequestdto.getCourse());
        student.setAge(studentRequestdto.getAge());

        Student saved = repository.save(student);

        return  new StudentResponsedto(
                saved.getId(),
                saved.getName(),
                saved.getCourse(),
                saved.getAge()
        );
    }
    public List<StudentResponsedto> getAllStudents() {

        return repository.findAll()
                .stream()
                .map(student -> new StudentResponsedto(
                        student.getId(),
                        student.getName(),
                        student.getCourse(),
                        student.getAge()
                ))
                .collect(Collectors.toList());
    }
}

