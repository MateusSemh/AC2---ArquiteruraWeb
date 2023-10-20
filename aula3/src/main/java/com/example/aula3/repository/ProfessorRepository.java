package com.example.aula3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aula3.models.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    List<Professor> findByCursosDescricao(String descricaoCurso);
    List<Professor> findByProfessorNome(String nomeProfessor);
}
