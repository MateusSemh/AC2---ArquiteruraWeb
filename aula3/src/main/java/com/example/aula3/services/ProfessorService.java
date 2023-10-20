package com.example.aula3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula3.models.Professor;
import com.example.aula3.repository.ProfessorRepository;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> getAllProfessores() {
        return professorRepository.findAll();
    }

    public Professor getProfessorById(Long id) {
        return professorRepository.findById(id).orElse(null);
    }

    public void addProfessor(Professor professor) {
        professorRepository.save(professor);
    }

    public void updateProfessor(Long id, Professor professor) {
        Professor existingProfessor = professorRepository.findById(id).orElse(null);
        if (existingProfessor != null) {
            professorRepository.save(existingProfessor);
        }
    }

    public void deleteProfessor(Long id) {
        professorRepository.deleteById(id);
    }
}
