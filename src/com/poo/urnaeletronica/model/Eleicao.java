package com.poo.urnaeletronica.model;

import java.util.ArrayList;
import java.util.List;

public class Eleicao {
    private int id;
    private String nome;
    private List<Candidato> candidatos;

    public Eleicao(int id, String nome) {
        this.setId(id);
        this.setNome(nome);
        this.candidatos = new ArrayList<>();
    }

    public void cadastrarCandidato(Candidato c) {
        candidatos.add(c);
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    // Método para listar os candidatos
    public void listarCandidatos() {
        System.out.println("Candidatos disponíveis:");
        for (Candidato c : candidatos) {
            System.out.println("ID: " + c.getId() + " - Nome: " + c.getNome() + " - Partido: " + c.getPartido());
        }
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
}
