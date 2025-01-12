package com.poo.urnaeletronica.model;

// Representa um cargo político
public class Cargo {
    private String nome;
    private int numeroVagas;

    // Construtor
    public Cargo(String nome, int numeroVagas) {
        this.nome = nome;
        this.numeroVagas = numeroVagas;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getNumeroVagas() {
        return numeroVagas;
    }
}
