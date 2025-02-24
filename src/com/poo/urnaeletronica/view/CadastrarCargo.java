package com.poo.urnaeletronica.view;

import com.poo.urnaeletronica.components.Botao;
import com.poo.urnaeletronica.components.CampoDeTexto;
import com.poo.urnaeletronica.components.Etiqueta;
import com.poo.urnaeletronica.controller.CargoController;
import com.poo.urnaeletronica.model.Cargo;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class CadastrarCargo extends JFrame {
    private CampoDeTexto campoNome;
    private CampoDeTexto campoVagas;
    private CargoController cargoController;

    public CadastrarCargo() {
        cargoController = new CargoController();
        initialize();
    }

    private void initialize() {
        setTitle("Cadastrar Cargo");
        setBounds(100, 100, 1025, 576);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        Botao btnSair = new Botao("Sair", 443, 444, 94, 34, e -> System.exit(0));
		getContentPane().add(btnSair);
		
		Botao btnVoltar = new Botao("Voltar", 243, 444, 102, 34, e -> {
            dispose(); // Fecha a janela atual
            Menu telaMenu = new Menu(); // Cria uma instância da tela anterior
            telaMenu.setVisible(false); // Exibe a tela anterior
        });
		getContentPane().add(btnVoltar);
	
        Botao btnSalvar = new Botao("Salvar", 28, 166, 102, 34, e -> {
            String nome = campoNome.getText();
            int vagas;

            try {
                vagas = Integer.parseInt(campoVagas.getText());
                cargoController.cadastrarCargo(nome, vagas);
                JOptionPane.showMessageDialog(null, "Cargo cadastrado com sucesso!");
                campoNome.setText("");
                campoVagas.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Número de vagas inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
        getContentPane().add(btnSalvar);

        Botao btnBuscar = new Botao("Buscar", 28, 252, 102, 34, e -> {
            String nome = campoNome.getText();
            Cargo cargo = cargoController.buscarCargo(nome);

            if (cargo != null) {
                campoVagas.setText(String.valueOf(cargo.getNumeroVagas()));
                JOptionPane.showMessageDialog(null, "Cargo encontrado: " + cargo);
            } else {
                JOptionPane.showMessageDialog(null, "Cargo não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
        getContentPane().add(btnBuscar);

        Botao btnExcluir = new Botao("Excluir", 28, 348, 102, 34, e -> {
            String nome = campoNome.getText();
            boolean removido = cargoController.excluirCargo(nome);

            if (removido) {
                JOptionPane.showMessageDialog(null, "Cargo excluído com sucesso!");
                campoNome.setText("");
                campoVagas.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Cargo não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
        getContentPane().add(btnExcluir);

        Botao btnVisualizarCargo = new Botao("Visualizar", 28, 444, 102, 34, e -> {
            VisualizarCargo visualizarCargo = new VisualizarCargo(); // Cria a tela de cadastro de cargo
            visualizarCargo.setVisible(true); // Torna a tela visível
        });
		getContentPane().add(btnVisualizarCargo);

        Etiqueta lblNome = new Etiqueta("Nome do Cargo", 173, 115, 188, 40);
        getContentPane().add(lblNome);

        campoNome = new CampoDeTexto(10, 173, 166, 364, 34);
        getContentPane().add(campoNome);

        Etiqueta lblVagas = new Etiqueta("Número de Vagas", 173, 297, 161, 40);
        getContentPane().add(lblVagas);

        campoVagas = new CampoDeTexto(10, 173, 348, 364, 34);
        getContentPane().add(campoVagas);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 128));
        panel.setBounds(0, 0, 1009, 92);
        getContentPane().add(panel);

        JLabel lblTitulo = new JLabel("CADASTRO DO CARGO");
        lblTitulo.setForeground(new Color(255, 255, 255));
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 50));
        panel.add(lblTitulo);

        JLabel imagemDeFundo = new JLabel("Imagem de fundo");
		imagemDeFundo.setBounds(0, 0, 1009, 547);
		imagemDeFundo.setIcon(new ImageIcon(CadastrarEleitor.class.getResource("../images/TelaMenu.png")));
		getContentPane().add(imagemDeFundo);
    }

    public void start() {
        setVisible(true);
    }
}
