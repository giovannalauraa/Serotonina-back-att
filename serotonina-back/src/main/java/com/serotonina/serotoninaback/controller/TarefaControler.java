package com.serotonina.serotoninaback.controller;

import java.util.List;

import com.serotonina.serotoninaback.model.Tarefa;
import com.serotonina.serotoninaback.repository.TarefaRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
// @CrossOrigin(origins = "http:\\localhost:3000")
public class TarefaControler {

    // @GetMapping("/tarefas-1")
    @GetMapping("/tarefas")
    public List<Tarefa> listaTodasTarefas() {
        return TarefaRepository.all();
    }

    @GetMapping("/tarefa")
    public List<Tarefa> todasAsTarefas() {
        return TarefaRepository.all();
    }

    @DeleteMapping("/tarefa/{id}")
    public boolean deletaTarefa(@PathVariable("id") int idtarefas){
        // deleta a tarefa no banco/repositório
        boolean isRemoved = TarefaRepository.deleteById(idtarefas-1);
        if(!isRemoved){
            return false;
        }
        return true;
    }

    @GetMapping("/tarefas/{id}")
    public Tarefa recuperarTarefasById(@PathVariable("id") int idtarefas) {
        return TarefaRepository.getById(idtarefas);
    }

    // @PostMapping("/tarefas-1")
    @PostMapping("/tarefas")
    public void addTarefas(
            @RequestBody Tarefa tarefas) {
        TarefaRepository.add(tarefas);
    }

    /*@DeleteMapping(value = "/tarefas/{id}")
    public void deleteTarefas(

    )*/
}