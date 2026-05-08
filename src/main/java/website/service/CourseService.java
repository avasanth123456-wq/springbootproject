package website.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import website.dto.CourseRequestDTO;
import website.dto.CourseResponseDTO;
import website.entity.Course;
import website.repository.CourseRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CourseService {

    @Autowired

    public CourseRepository repository;

    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

    public CourseResponseDTO createCourse(@RequestBody CourseRequestDTO requestDTO) {

        Course course = new Course();

        course.setId(requestDTO.getId());
        course.setTitle(requestDTO.getTitle());
        course.setLanguage(requestDTO.getLanguage());
        course.setDuration(requestDTO.getDuration());

        Course saved = repository.save(course);

        return new CourseResponseDTO(
                saved.getId(),
                saved.getTitle(),
                saved.getLanguage(),
                saved.getDuration()

        );
    }


    public List<CourseResponseDTO> getAllCourse() {
        return repository.findAll()
                .stream()
                .map(course -> new CourseResponseDTO(
                        course.getId(),
                        course.getTitle(),
                        course.getLanguage(),
                        course.getDuration()
                ))
                .collect(Collectors.toList());
    }
}
