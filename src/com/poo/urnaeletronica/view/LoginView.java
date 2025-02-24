package com.poo.urnaeletronica.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

import com.poo.urnaeletronica.components.Botao;
import com.poo.urnaeletronica.components.CampoDeTexto;
import com.poo.urnaeletronica.components.Etiqueta;
import com.poo.urnaeletronica.controller.UsuarioController;
import com.poo.urnaeletronica.model.Usuario;

public class LoginView extends JFrame {
    private CampoDeTexto campoLogin;
    private JPasswordField campoSenha;
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
                
        Botao btnSair = new Botao("Sair", 516, 291,
            100, 30, e -> System.exit(0));
        getContentPane().add(btnSair);

        Botao btnLogin = new Botao("Entrar", 378, 291,
        100, 30, e -> {
            String login = campoLogin.getText();
            String senha = new String(campoSenha.getPassword());

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

        Etiqueta lblLogin = new Etiqueta("Login:", 374, 93, 80, 25);
        getContentPane().add(lblLogin);

        campoLogin = new CampoDeTexto(10, 374, 129, 242, 25);
        getContentPane().add(campoLogin);

        Etiqueta lblSenha = new Etiqueta("Senha:", 374, 175, 80, 25);
        getContentPane().add(lblSenha);

        campoSenha = new JPasswordField();
        campoSenha.setBounds(374, 211, 242, 25);
        getContentPane().add(campoSenha);
        
        // Imagem de fundo
        Etiqueta imagemDeFundo = new Etiqueta("Imagem de fundo", 0, 0, 667, 345);
        imagemDeFundo.setIcon(new ImageIcon(LoginView.class.getResource("../images/TelaLogin.png")));
        getContentPane().add(imagemDeFundo);

        setVisible(true);
    }

    private void abrirMenuPrincipal() {
        Menu menu = new Menu();
        menu.start();
    }
}
