package com.example.aula3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.aula3.models.Curso;
import com.example.aula3.services.CursoService;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> getAllCursos() {
        return cursoService.getAllCursos();
    }

    @GetMapping("/{id}")
    public Curso getCurso(@PathVariable Long id) {
        return cursoService.getCursoById(id);
    }

    @PostMapping
    public void addCurso(@RequestBody Curso curso) {
        cursoService.addCurso(curso);
    }

    @PutMapping("/{id}")
    public void updateCurso(@PathVariable Long id, @RequestBody Curso curso) {
        cursoService.updateCurso(id, curso);
    }

    @DeleteMapping("/{id}")
    public void deleteCurso(@PathVariable Long id) {
        cursoService.deleteCurso(id);
    }
}
