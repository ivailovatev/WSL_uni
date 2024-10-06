package uni.pld.university.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uni.pld.university.models.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
