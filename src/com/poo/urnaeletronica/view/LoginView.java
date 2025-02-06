package com.poo.urnaeletronica.view;

import com.poo.urnaeletronica.controller.UsuarioController;
import com.poo.urnaeletronica.model.Usuario;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView {
    private JFrame frame;
    private JTextField loginField;
    private JPasswordField senhaField;
    private UsuarioController usuarioController;
    private Usuario usuarioLogado;

    public LoginView() {
        usuarioController = new UsuarioController();
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Login");
        frame.setBounds(100, 100, 400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblLogin = new JLabel("Login:");
        lblLogin.setBounds(50, 50, 80, 25);
        frame.getContentPane().add(lblLogin);

        loginField = new JTextField();
        loginField.setBounds(140, 50, 180, 25);
        frame.getContentPane().add(loginField);
        loginField.setColumns(10);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(50, 90, 80, 25);
        frame.getContentPane().add(lblSenha);

        senhaField = new JPasswordField();
        senhaField.setBounds(140, 90, 180, 25);
        frame.getContentPane().add(senhaField);

        JButton btnLogin = new JButton("Entrar");
        btnLogin.setBounds(140, 130, 100, 30);
        frame.getContentPane().add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String login = loginField.getText();
                String senha = new String(senhaField.getPassword());

                usuarioLogado = usuarioController.autenticar(login, senha);

                if (usuarioLogado != null) {
                    JOptionPane.showMessageDialog(frame, "Login bem-sucedido! Bem-vindo, " + usuarioLogado.getCargo());
                    frame.dispose(); // Fecha a tela de login
                    abrirMenuPrincipal();
                } else {
                    JOptionPane.showMessageDialog(frame, "Login ou senha incorretos!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }

    private void abrirMenuPrincipal() {
        Menu menu = new Menu();
        menu.start();
    }

    public void start() {
        frame.setVisible(true);
    }
}
