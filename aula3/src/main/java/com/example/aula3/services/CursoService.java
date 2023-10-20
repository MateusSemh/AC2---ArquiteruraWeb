package com.example.aula3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula3.models.Curso;
import com.example.aula3.repository.CursoRepository;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    public Curso getCursoById(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    public void addCurso(Curso curso) {
        cursoRepository.save(curso);
    }

    public void updateCurso(Long id, Curso curso) {
        Curso existingCurso = cursoRepository.findById(id).orElse(null);
        if (existingCurso != null) {
            cursoRepository.save(existingCurso);
        }
    }

    public void deleteCurso(Long id) {
        cursoRepository.deleteById(id);
    }
}
