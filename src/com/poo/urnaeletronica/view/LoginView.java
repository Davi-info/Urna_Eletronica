package com.poo.urnaeletronica.view;

import com.poo.urnaeletronica.controller.UsuarioController;
import com.poo.urnaeletronica.model.Usuario;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

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
        frame.setBounds(100, 100, 683, 384);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
                
                JButton btnSair = new JButton("Sair");
                btnSair.setFont(new Font("Tahoma", Font.BOLD, 12));
                btnSair.setBounds(516, 291, 100, 30);
                frame.getContentPane().add(btnSair);
                btnSair.addActionListener(e -> System.exit(0));
        
                JButton btnLogin = new JButton("Entrar");
                btnLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
                btnLogin.setBounds(378, 291, 100, 30);
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

        JLabel lblLogin = new JLabel("Login:");
        lblLogin.setForeground(Color.WHITE);
        lblLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblLogin.setBounds(374, 93, 80, 25);
        frame.getContentPane().add(lblLogin);

        loginField = new JTextField();
        loginField.setBounds(374, 129, 242, 25);
        frame.getContentPane().add(loginField);
        loginField.setColumns(10);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setForeground(Color.WHITE);
        lblSenha.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblSenha.setBounds(374, 175, 80, 25);
        frame.getContentPane().add(lblSenha);

        senhaField = new JPasswordField();
        senhaField.setBounds(374, 211, 242, 25);
        frame.getContentPane().add(senhaField);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(LoginView.class.getResource("/com/poo/urnaeletronica/view/TelaLogin.png")));
        lblNewLabel.setBounds(0, 0, 667, 345);
        frame.getContentPane().add(lblNewLabel);

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
