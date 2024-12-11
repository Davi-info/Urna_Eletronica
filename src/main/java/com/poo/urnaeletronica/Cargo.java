package com.poo.urnaeletronica;

// Representa um cargo político
public class Cargo {
    private String nome;
    private int numeroVagas;

    // Construtor
    public Cargo(String nome, int numeroVagas) {
        this.nome = nome;
        this.numeroVagas = numeroVagas;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public int getNumeroVagas() {
        return numeroVagas;
    }
}
