package com.example.aula3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.aula3.models.Agenda;
import com.example.aula3.services.AgendaService;

import java.util.List;

@RestController
@RequestMapping("/agendas")
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

    @GetMapping
    public List<Agenda> getAllAgendas() {
        return agendaService.getAllAgendas();
    }

    @GetMapping("/{id}")
    public Agenda getAgenda(@PathVariable Long id) {
        return agendaService.getAgendaById(id);
    }

    @PostMapping
    public void addAgenda(@RequestBody Agenda agenda) {
        agendaService.addAgenda(agenda);
    }

    @PutMapping("/{id}")
    public void updateAgenda(@PathVariable Long id, @RequestBody Agenda agenda) {
        agendaService.updateAgenda(id, agenda);
    }

    @DeleteMapping("/{id}")
    public void deleteAgenda(@PathVariable Long id) {
        agendaService.deleteAgenda(id);
    }
}
