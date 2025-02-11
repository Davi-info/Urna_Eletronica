package com.poo.urnaeletronica.view;

import com.poo.urnaeletronica.controller.CargoController;
import com.poo.urnaeletronica.model.Cargo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class CadastrarCargo extends JFrame {
    private JTextField nomeField;
    private JTextField vagasField;
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

        JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSair.setBounds(443, 444, 94, 34);
		getContentPane().add(btnSair);
        btnSair.addActionListener(e -> System.exit(0));
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVoltar.setBounds(243, 444, 102, 34);
		getContentPane().add(btnVoltar);
		
		btnVoltar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        dispose(); // Fecha a janela atual
		        Menu telaMenu = new Menu(); // Cria uma instância da tela anterior
		        telaMenu.setVisible(false); // Exibe a tela anterior
		    }
		});
		

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnSalvar.setBounds(28, 166, 102, 34);
        getContentPane().add(btnSalvar);

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnBuscar.setBounds(28, 252, 102, 34);
        getContentPane().add(btnBuscar);

        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnExcluir.setBounds(28, 348, 102, 34);
        getContentPane().add(btnExcluir);

        JButton btnVisualizarCargo = new JButton("Visualizar");
		btnVisualizarCargo.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVisualizarCargo.setBounds(28, 444, 102, 34);
		getContentPane().add(btnVisualizarCargo);

		btnVisualizarCargo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VisualizarCargo visualizarCargo = new VisualizarCargo(); // Cria a tela de cadastro de cargo
				visualizarCargo.setVisible(true); // Torna a tela visível
			}
		});

        JLabel lblNome = new JLabel("Nome do Cargo");
        lblNome.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNome.setForeground(Color.WHITE);
        lblNome.setBounds(173, 115, 188, 40);
        getContentPane().add(lblNome);

        nomeField = new JTextField();
        nomeField.setBounds(173, 166, 364, 34);
        getContentPane().add(nomeField);
        nomeField.setColumns(10);

        JLabel lblVagas = new JLabel("Número de Vagas");
        lblVagas.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblVagas.setForeground(Color.WHITE);
        lblVagas.setBounds(173, 297, 161, 40);
        getContentPane().add(lblVagas);

        vagasField = new JTextField();
        vagasField.setColumns(10);
        vagasField.setBounds(173, 348, 364, 34);
        getContentPane().add(vagasField);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 128));
        panel.setBounds(0, 0, 1009, 92);
        getContentPane().add(panel);

        JLabel lblTitulo = new JLabel("CADASTRO DO CARGO");
        lblTitulo.setForeground(new Color(255, 255, 255));
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 50));
        panel.add(lblTitulo);

        JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1009, 547);
		lblNewLabel.setIcon(new ImageIcon(CadastrarEleitor.class.getResource("TelaMenu.png")));
		getContentPane().add(lblNewLabel);

        // 🎯 AÇÕES DOS BOTÕES

        btnSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                int vagas;

                try {
                    vagas = Integer.parseInt(vagasField.getText());
                    cargoController.cadastrarCargo(nome, vagas);
                    JOptionPane.showMessageDialog(null, "Cargo cadastrado com sucesso!");
                    nomeField.setText("");
                    vagasField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Número de vagas inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                Cargo cargo = cargoController.buscarCargo(nome);

                if (cargo != null) {
                    vagasField.setText(String.valueOf(cargo.getNumeroVagas()));
                    JOptionPane.showMessageDialog(null, "Cargo encontrado: " + cargo);
                } else {
                    JOptionPane.showMessageDialog(null, "Cargo não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                boolean removido = cargoController.excluirCargo(nome);

                if (removido) {
                    JOptionPane.showMessageDialog(null, "Cargo excluído com sucesso!");
                    nomeField.setText("");
                    vagasField.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Cargo não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public void start() {
        setVisible(true);
    }
}
