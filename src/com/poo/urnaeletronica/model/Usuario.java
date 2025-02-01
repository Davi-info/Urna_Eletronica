package com.poo.urnaeletronica.model;

public class Usuario {
    private String nome;
    private String login;
    private String senha;
    private String cargo; // Exemplo: "Administrador", "Eleitor"

    public Usuario(String nome, String login, String senha, String cargo) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getCargo() {
        return cargo;
    }
}

