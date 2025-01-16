package com.poo.urnaeletronica.model;

// Representa um eleitor na eleição
public class Eleitor {
    private int id;
    private String nome;
    private Voto voto;

    // Construtor
    public Eleitor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Método para confirmar o voto
    public void confirmarVoto(Voto voto) {
        this.voto = voto;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Voto getVoto() {
        return voto;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVoto(Voto voto) {
        this.voto = voto;
    }
}
