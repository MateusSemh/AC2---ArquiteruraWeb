package com.example.aula3;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.aula3.models.Agenda;
import com.example.aula3.models.Curso;
import com.example.aula3.models.Professor;
import com.example.aula3.services.ProfessorService;


@SpringBootApplication
public class MinhaAplicacao {
    

    @Autowired
    private ProfessorService professorService;

    public static void main(String[] args) {
        SpringApplication.run(MinhaAplicacao.class, args);
    }

    public void testCriarProfessorInserirCurso() {
        // Criando um novo professor
        Professor professor = new Professor();
        professor.setNome("Arnaldo César");
        professor.setCpf("12345678912");
        professor.setRg("123456789");
        professor.setEndereco("Rua Facens, 123");
        professor.setCelular("4002-8922");

        // Criando um novo curso
        Curso curso = new Curso();
        curso.setDescricao("Fisioterapia XYZ");
        curso.setCargaHoraria(40);
        curso.setObjetivos("Capacitar fisioterapeutas");
        curso.setEmenta("Nesse curso, aprenderemos técnicas de fisioterapia");
        
        // Criando uma nova agenda
        Agenda agenda = new Agenda();
        agenda.setDataInicio("17/03"); 
        agenda.setDataFim("20/03"); 
        agenda.setHorarioInicio("8:00"); 
        agenda.setHorarioFim("17:00"); 
        agenda.setCidade("Marília");
        agenda.setEstado("SP");
        agenda.setCep("123321");
        agenda.setProfessor(professor); 
        agenda.setCurso(curso); 

        professor.setAgendas(List.of(agenda));
        professor.setCursos(List.of(curso));
        professorService.addProfessor(professor);

       
    }
}




