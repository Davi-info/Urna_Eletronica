package com.poo.urnaeletronica;

// Representa um candidato em uma eleição
public class Candidato {
    private int id;
    private String nome;
    private Cargo cargo;
    private String partido;

    // Construtor
    public Candidato(int id, String nome, Cargo cargo, String partido) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.partido = partido;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public String getPartido() {
        return partido;
    }
}


