package com.poo.urnaeletronica;

// Representa o tipo de uma eleição (ex: presidencial, municipal)
public class TipoEleicao {
    private String nome;
    private String descricao;

    // Construtor
    public TipoEleicao(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}

