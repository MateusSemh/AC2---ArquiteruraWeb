package com.example.aula3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aula3.models.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
