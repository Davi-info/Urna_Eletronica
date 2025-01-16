package com.poo.urnaeletronica.model;

// Representa um candidato em uma eleição
public class Candidato {
    private int id;
    private String nome;
//    private Cargo cargo;
    private String partido;

    public Candidato(int id, String nome, String partido) {
        this.id = id;
        this.nome = nome;
//        this.cargo = cargo;
        this.partido = partido;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

//    public Cargo getCargo() {
//        return cargo;
//    }

    public String getPartido() {
        return partido;
    }

    // Setters
    public int setId(int id) {
        return this.id = id; 
    }

    public String setNome(String nome) {
        return this.nome = nome; 
    }

//    public Cargo setCargo(Cargo cargo) {
//        return this.cargo = cargo;
//    }

    public String setPartido(String partido) {
        return this.partido = partido; 
    }
}



