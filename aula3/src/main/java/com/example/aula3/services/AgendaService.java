package com.example.aula3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula3.models.Agenda;
import com.example.aula3.repository.AgendaRepository;

import java.util.List;

@Service
public class AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    public List<Agenda> getAllAgendas() {
        return agendaRepository.findAll();
    }

    public Agenda getAgendaById(Long id) {
        return agendaRepository.findById(id).orElse(null);
    }

    public void addAgenda(Agenda agenda) {
        agendaRepository.save(agenda);
    }

    public void updateAgenda(Long id, Agenda agenda) {
        Agenda existingAgenda = agendaRepository.findById(id).orElse(null);
        if (existingAgenda != null) {
            agendaRepository.save(existingAgenda);
        }
    }

    public void deleteAgenda(Long id) {
        agendaRepository.deleteById(id);
    }
}
