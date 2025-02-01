package com.poo.urnaeletronica.controller;

import com.poo.urnaeletronica.model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioController {
    private List<Usuario> usuarios;

    public UsuarioController() {
        usuarios = new ArrayList<>();
        // Usuário padrão para testes
        usuarios.add(new Usuario("Admin", "admin", "1234", "Administrador"));
        usuarios.add(new Usuario("Eleitor1", "eleitor1", "senha123", "Eleitor"));
    }

    public Usuario autenticar(String login, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
                return usuario;
            }
        }
        return null;
    }

    public void cadastrarUsuario(String nome, String login, String senha, String cargo) {
        usuarios.add(new Usuario(nome, login, senha, cargo));
    }
}
