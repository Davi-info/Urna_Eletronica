package com.poo.urnaeletronica.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VisualizarEleicao {

	private JFrame frame;
	private JTable table;

	/**
	 * Create the application.
	 */
	public VisualizarEleicao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1025, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Eleição", "Data do Inicio", "Data do Fim", "Tipo de Eleição"
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
		frame.getContentPane().add(scrollPane);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(806, 492, 94, 34);
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(btnSair);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(694, 492, 102, 34);
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(btnVoltar);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1009, 92);
		panel.setBackground(new Color(0, 0, 128));
		frame.getContentPane().add(panel);
		
		JLabel lblEleicoesCadastradas = new JLabel("ELEIÇÕES CADASTRADAS");
		lblEleicoesCadastradas.setForeground(new Color(255, 255, 255));
		lblEleicoesCadastradas.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel.add(lblEleicoesCadastradas);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(-16, -10, 1025, 547);
		lblNewLabel.setIcon(new ImageIcon(CadastrarEleitor.class.getResource("TelaMenu.png")));
		frame.getContentPane().add(lblNewLabel);
	}
	
	public void start() {
		frame.setVisible(true);
	}
}
