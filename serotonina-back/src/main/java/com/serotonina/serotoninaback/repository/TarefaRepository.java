package com.serotonina.serotoninaback.repository;

import java.util.ArrayList;
import java.util.List;

import com.serotonina.serotoninaback.model.Tarefa;

public class TarefaRepository {
    private static TarefaRepository repo;

    private ArrayList<com.serotonina.serotoninaback.model.Tarefa> tarefas;
    
    private TarefaRepository() {
        this.tarefas = new ArrayList<>();
    }

    public static void init() {
        if (TarefaRepository.repo == null) {
            // Criando uma instância/objeto de TarefasRepository em repo
            TarefaRepository.repo = new TarefaRepository();

            // Adicionando algumas tarefas iniciais
            // Tarefa 1:
            TarefaRepository.add(
                    new Tarefa(
                            "Terminar o projeto de LTP."));
            // Tarefa 2
            TarefaRepository.add(
                    new Tarefa(
                            "Estudar matemática."));
            // Tarefa 3
            TarefaRepository.add(
                    new Tarefa(
                            "Estudar coreano."));

        } else {
            System.out.println("O banco já foi inicializado!");
        }
    }

    public static void add(Tarefa tarefa) {
        TarefaRepository.repo.tarefas.add(tarefa);
    }

    public static List<Tarefa> all() {
        return TarefaRepository.repo.tarefas;
    }

    public static Tarefa getById(int id) {
        return TarefaRepository.repo.tarefas.stream().filter((tarefa) -> tarefa.getId() == id).toList().get(0);
    }

    public static boolean deleteById(int id){
        TarefaRepository.repo.tarefas.remove(id);
        return true;
    }
}