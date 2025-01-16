package com.poo.urnaeletronica.model;

import com.poo.urnaeletronica.enums.TipoVoto;

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

    // Setters
    public void setTipo(TipoVoto tipo) {
        this.tipo = tipo;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

}



