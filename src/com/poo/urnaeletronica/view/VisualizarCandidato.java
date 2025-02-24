package com.poo.urnaeletronica.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.poo.urnaeletronica.components.Botao;

public class VisualizarCandidato extends JFrame {
	private JTable table;

	public VisualizarCandidato() {
		initialize();
	}
	
	private void initialize() {
		setTitle("Visualizar Candidato");
		setBounds(100, 100, 1025, 576);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Candidato", "Cargo", "Partido", "Foto"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(120); // "Candidato"
		table.getColumnModel().getColumn(1).setPreferredWidth(50); // "Cargo"
		table.getColumnModel().getColumn(2).setPreferredWidth(50); // "Partido"
		table.getColumnModel().getColumn(3).setPreferredWidth(75); // "Foto"
		
		table.setBounds(135, 148, 736, 75);
		// table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setRowHeight(20); // Define a altura das linhas para 30 pixels
		
		table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
		table.getTableHeader().setBackground(Color.LIGHT_GRAY); // Fundo cinza claro
        table.getTableHeader().setPreferredSize(new Dimension(50, 20));

		// Criando o JScrollPane e adicionando a tabela nele
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(118, 148, 753, 45);
		getContentPane().add(scrollPane);
		
		Botao btnSair = new Botao("Sair", 806, 492, 94, 34, e -> System.exit(0));
		getContentPane().add(btnSair);
		
		Botao btnVoltar = new Botao("Voltar", 694, 492, 102, 34, e -> {
			dispose(); // Fecha a janela atual
			CadastrarCandidato cadastrarCandidato = new CadastrarCandidato(); // Cria uma instância da tela anterior
			cadastrarCandidato.setVisible(false); // Exibe a tela anterior
		});
		getContentPane().add(btnVoltar);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1009, 92);
		panel.setBackground(new Color(0, 0, 128));
		getContentPane().add(panel);
		
		JLabel lblCandidatosCadastrados = new JLabel("CANDIDATOS CADASTRADOS");
		lblCandidatosCadastrados.setForeground(new Color(255, 255, 255));
		lblCandidatosCadastrados.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel.add(lblCandidatosCadastrados);
		
		JLabel imagemDeFundo = new JLabel("Imagem de fundo");
		imagemDeFundo.setBounds(-16, -10, 1025, 547);
		imagemDeFundo.setIcon(new ImageIcon(CadastrarEleitor.class.getResource("../images/TelaMenu.png")));
		getContentPane().add(imagemDeFundo);
	}
	
	public void start() {
		setVisible(true);
	}
}
