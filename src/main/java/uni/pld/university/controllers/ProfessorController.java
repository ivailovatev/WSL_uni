package uni.pld.university.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uni.pld.university.models.Professor;
import uni.pld.university.repositories.ProfessorRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/professors")
public class ProfessorController {
    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping
    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Professor> getProfessorById(@PathVariable Long id) {
        Optional<Professor> professor = professorRepository.findById(id);
        if (professor.isPresent()) {
            return ResponseEntity.ok(professor.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Professor createProfessor(@RequestBody Professor professor) {
        return professorRepository.save(professor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Professor> updateProfessor(@PathVariable Long id, @RequestBody Professor professorDetails) {
        Optional<Professor> professor = professorRepository.findById(id);
        if (professor.isPresent()) {
            Professor updatedProfessor = professor.get();
            updatedProfessor.setName(professorDetails.getName());
            updatedProfessor.setDepartment(professorDetails.getDepartment());
            updatedProfessor.setSpecialization(professorDetails.getSpecialization());
            return ResponseEntity.ok(professorRepository.save(updatedProfessor));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProfessor(@PathVariable Long id) {
        professorRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
