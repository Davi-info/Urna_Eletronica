package com.poo.urnaeletronica.view;

import com.poo.urnaeletronica.controller.CargoController;
import com.poo.urnaeletronica.model.Cargo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastrarCargo {
    private JFrame frame;
    private JTextField nomeField;
    private JTextField vagasField;
    private CargoController cargoController;

    public CadastrarCargo() {
        cargoController = new CargoController();
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1025, 576);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnSalvar.setBounds(28, 166, 102, 34);
        frame.getContentPane().add(btnSalvar);

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnBuscar.setBounds(28, 252, 102, 34);
        frame.getContentPane().add(btnBuscar);

        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnExcluir.setBounds(28, 348, 102, 34);
        frame.getContentPane().add(btnExcluir);

        JLabel lblNome = new JLabel("Nome do Cargo");
        lblNome.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNome.setForeground(Color.WHITE);
        lblNome.setBounds(173, 115, 188, 40);
        frame.getContentPane().add(lblNome);

        nomeField = new JTextField();
        nomeField.setBounds(173, 166, 364, 34);
        frame.getContentPane().add(nomeField);
        nomeField.setColumns(10);

        JLabel lblVagas = new JLabel("Número de Vagas");
        lblVagas.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblVagas.setForeground(Color.WHITE);
        lblVagas.setBounds(173, 297, 161, 40);
        frame.getContentPane().add(lblVagas);

        vagasField = new JTextField();
        vagasField.setColumns(10);
        vagasField.setBounds(173, 348, 364, 34);
        frame.getContentPane().add(vagasField);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 128));
        panel.setBounds(0, 0, 1009, 92);
        frame.getContentPane().add(panel);

        JLabel lblTitulo = new JLabel("CADASTRO DO CARGO");
        lblTitulo.setForeground(new Color(255, 255, 255));
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 50));
        panel.add(lblTitulo);

        // 🎯 AÇÕES DOS BOTÕES

        btnSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                int vagas;

                try {
                    vagas = Integer.parseInt(vagasField.getText());
                    cargoController.cadastrarCargo(nome, vagas);
                    JOptionPane.showMessageDialog(frame, "Cargo cadastrado com sucesso!");
                    nomeField.setText("");
                    vagasField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Número de vagas inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                Cargo cargo = cargoController.buscarCargo(nome);

                if (cargo != null) {
                    vagasField.setText(String.valueOf(cargo.getNumeroVagas()));
                    JOptionPane.showMessageDialog(frame, "Cargo encontrado: " + cargo);
                } else {
                    JOptionPane.showMessageDialog(frame, "Cargo não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                boolean removido = cargoController.excluirCargo(nome);

                if (removido) {
                    JOptionPane.showMessageDialog(frame, "Cargo excluído com sucesso!");
                    nomeField.setText("");
                    vagasField.setText("");
                } else {
                    JOptionPane.showMessageDialog(frame, "Cargo não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public void start() {
        frame.setVisible(true);
    }
}
