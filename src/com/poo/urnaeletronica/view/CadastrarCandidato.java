package com.poo.urnaeletronica.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastrarCandidato {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the application.
	 */
	public CadastrarCandidato() {
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
		
		JButton btnNewButton_1_1_1_1_1_1 = new JButton("Sair");
		btnNewButton_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_1_1_1_1.setBounds(806, 492, 94, 34);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("Voltar");
		btnNewButton_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_1_1_1.setBounds(694, 492, 102, 34);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(694, 166, 205, 251);
		frame.getContentPane().add(panel_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Procurar");
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_1_1.setBounds(435, 492, 102, 34);
		frame.getContentPane().add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Visualizar");
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_1.setBounds(28, 444, 102, 34);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Excluir");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1.setBounds(28, 348, 102, 34);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnBusca = new JButton("Buscar");
		btnBusca.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBusca.setBounds(28, 252, 102, 34);
		frame.getContentPane().add(btnBusca);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(28, 166, 102, 34);
		frame.getContentPane().add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(173, 444, 364, 34);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Foto");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1_1_1.setBounds(173, 393, 161, 40);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Partido");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1_1.setBounds(173, 297, 161, 40);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(173, 348, 364, 34);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cargo");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(173, 211, 161, 40);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(173, 252, 364, 34);
		frame.getContentPane().add(textField_1);
		
		textField = new JTextField();
		textField.setBounds(173, 166, 364, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nome do Candidato");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(173, 115, 188, 40);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 1009, 92);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("CADASTRO DO CANDIDATO");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1009, 547);
		lblNewLabel.setIcon(new ImageIcon(CadastrarEleitor.class.getResource("TelaMenu.png")));
		frame.getContentPane().add(lblNewLabel);
	}
	
	public void start() {
		frame.setVisible(true);
	}
}
