package com.poo.urnaeletronica.model;

// Representa um voto realizado por um eleitor
public class Voto {
    private TipoVoto tipo;
    private Candidato candidato;

    // Construtor
    public Voto(TipoVoto tipo, Candidato candidato) {
        this.tipo = tipo;
        this.candidato = candidato;
    }

    // Getters
    public TipoVoto getTipo() {
        return tipo;
    }

    public Candidato getCandidato() {
        return candidato;
    }
}

// Enum para os tipos de voto
enum TipoVoto {
    VOTO_VALIDO, VOTO_BRANCO, VOTO_NULO
}


