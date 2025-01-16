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

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroVagas(int numeroVagas) {
        this.numeroVagas = numeroVagas;
    }

    @Override
    public String toString() {
        return "nome='" + nome + ", número vagas=" + numeroVagas + "'";
    }
}
