package website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import website.dto.CourseRequestDTO;
import website.dto.CourseResponseDTO;
import website.service.CourseService;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService service;

    public CourseController(CourseService service){
        this.service=service;
    }
    @PostMapping
    public CourseResponseDTO createCourse(@RequestBody
                                              CourseRequestDTO courseRequestDTO){
        return service.createCourse(courseRequestDTO);
    }
    @GetMapping
    public List<CourseResponseDTO>  gatAllCourses(){
        return service.getAllCourse();
    }
}
