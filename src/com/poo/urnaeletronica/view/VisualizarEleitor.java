package com.poo.urnaeletronica.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Dimension;

public class VisualizarEleitor {

	private JFrame frame;
	private JTable table;

	/**
	 * Create the application.
	 */
	public VisualizarEleitor() {
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
				"Eleitor", "Voto", "Data do Voto", "Foto"
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
		
		JButton btnNewButton_1_1_1_1_1_1 = new JButton("Sair");
		btnNewButton_1_1_1_1_1_1.setBounds(806, 492, 94, 34);
		btnNewButton_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(btnNewButton_1_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("Voltar");
		btnNewButton_1_1_1_1_1.setBounds(694, 492, 102, 34);
		btnNewButton_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(btnNewButton_1_1_1_1_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1009, 92);
		panel.setBackground(new Color(0, 0, 128));
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("ELEITORES CADASTRADOS");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(-16, -10, 1025, 547);
		lblNewLabel.setIcon(new ImageIcon(CadastrarEleitor.class.getResource("TelaMenu.png")));
		frame.getContentPane().add(lblNewLabel);
	}

	public void start() {
		frame.setVisible(true);
	}
}
