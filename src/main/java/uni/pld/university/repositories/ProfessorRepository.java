package uni.pld.university.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uni.pld.university.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
