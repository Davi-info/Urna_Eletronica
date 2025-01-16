package com.poo.urnaeletronica.model;

import com.poo.urnaeletronica.enums.TipoEleicao;

import java.util.ArrayList;

public class Eleicao {
    private int id;
    private String nome;
    private TipoEleicao tipoEleicao;
    private ArrayList<Candidato> candidatos;
    private ArrayList<Eleitor> eleitores;

    public Eleicao(int id, String nome, TipoEleicao tipoEleicao) {
        this.id = id;
        this.nome = nome;
        this.tipoEleicao = tipoEleicao;
        this.candidatos = new ArrayList<>();
		this.eleitores = new ArrayList<>();
	}


    // Getters
	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}

    // Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setId(int id) {
		this.id = id;
	}

    public ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    public ArrayList<Eleitor> getEleitores() {
        return eleitores;
    }
}
