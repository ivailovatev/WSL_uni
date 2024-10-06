package uni.pld.university.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uni.pld.university.models.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
