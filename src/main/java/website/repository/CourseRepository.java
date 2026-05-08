package website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import website.entity.Course;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
