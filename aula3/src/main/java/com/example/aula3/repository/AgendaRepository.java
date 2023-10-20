package com.example.aula3.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aula3.models.Agenda;
import com.example.aula3.models.Professor;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long> {
    List<Agenda> findByDataInicioBetween(LocalDate dataInicial, LocalDate dataFinal); 
    List<Agenda> findByProfessor(Professor professor);
}
