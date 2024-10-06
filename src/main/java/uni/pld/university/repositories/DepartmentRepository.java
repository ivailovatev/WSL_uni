package uni.pld.university.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uni.pld.university.models.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
