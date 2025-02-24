package com.poo.urnaeletronica.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

import com.poo.urnaeletronica.components.Button;
import com.poo.urnaeletronica.components.Label;
import com.poo.urnaeletronica.controller.UsuarioController;
import com.poo.urnaeletronica.model.Usuario;

public class LoginView extends JFrame {
    private JTextField loginField;
    private JPasswordField senhaField;
    private UsuarioController usuarioController;
    private Usuario usuarioLogado;

    public LoginView() {
        usuarioController = new UsuarioController();
        initialize();
    }

    private void initialize() {
        setTitle("Login");
        setBounds(100, 100, 683, 384);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
                
        Button btnSair = new Button("Sair", 516, 291,
            100, 30, e -> System.exit(0));
        getContentPane().add(btnSair);

        Button btnLogin = new Button("Entrar", 378, 291,
        100, 30, e -> {
            String login = loginField.getText();
            String senha = new String(senhaField.getPassword());

            usuarioLogado = usuarioController.autenticar(login, senha);

            if (usuarioLogado != null) {
                JOptionPane.showMessageDialog(this, "Login bem-sucedido! Bem-vindo, " + usuarioLogado.getCargo());
                dispose(); // Fecha a tela de login
                abrirMenuPrincipal();
            } else {
                JOptionPane.showMessageDialog(this, "Login ou senha incorretos!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
        getContentPane().add(btnLogin);

        Label lblLogin = new Label("Login:", 374, 93, 80, 25);
        getContentPane().add(lblLogin);

        loginField = new JTextField();
        loginField.setBounds(374, 129, 242, 25);
        getContentPane().add(loginField);
        loginField.setColumns(10);

        Label lblSenha = new Label("Senha:", 374, 175, 80, 25);
        getContentPane().add(lblSenha);

        senhaField = new JPasswordField();
        senhaField.setBounds(374, 211, 242, 25);
        getContentPane().add(senhaField);
        
        // Imagem de fundo
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(LoginView.class.getResource("../images/TelaLogin.png")));
        lblNewLabel.setBounds(0, 0, 667, 345);
        getContentPane().add(lblNewLabel);

        setVisible(true);
    }

    private void abrirMenuPrincipal() {
        Menu menu = new Menu();
        menu.start();
    }
}
