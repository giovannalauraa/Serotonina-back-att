package com.serotonina.serotoninaback.model;

public class Tarefa {
    private static int idCounter = 0;

    private int id;
    private String tarefaNota;

    public Tarefa() {
        this.id = ++Tarefa.idCounter;
        this.tarefaNota = "teste";
    }

    public Tarefa(String tarefaNota) {
        this.id = ++Tarefa.idCounter;
        this.tarefaNota = tarefaNota;
    }

    public int getId() {
        return id;
    }

    public String getTarefa() {
        return tarefaNota;
    }

    public void setTarefa(String tarefaNota) {
        this.tarefaNota = tarefaNota;
    }

}
