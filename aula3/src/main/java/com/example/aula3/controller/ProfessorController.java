package com.example.aula3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.aula3.models.Professor;
import com.example.aula3.services.ProfessorService;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public List<Professor> getAllProfessores() {
        return professorService.getAllProfessores();
    }

    @GetMapping("/{id}")
    public Professor getProfessor(@PathVariable Long id) {
        return professorService.getProfessorById(id);
    }

    @PostMapping
    public void addProfessor(@RequestBody Professor professor) {
        professorService.addProfessor(professor);
    }

    @PutMapping("/{id}")
    public void updateProfessor(@PathVariable Long id, @RequestBody Professor professor) {
        professorService.updateProfessor(id, professor);
    }

    @DeleteMapping("/{id}")
    public void deleteProfessor(@PathVariable Long id) {
        professorService.deleteProfessor(id);
    }
}
