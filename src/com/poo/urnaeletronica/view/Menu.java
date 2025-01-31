package com.poo.urnaeletronica.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Menu {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public Menu() {
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
		
		JButton btnNewButton = new JButton("Relatório");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_2 = new JButton("Sair");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(637, 406, 125, 79);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1_2 = new JButton("Limpar Dados do Banco");
		btnNewButton_1_1_2.setIcon(new ImageIcon(Menu.class.getResource("IconeLimpaDados.png")));
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_2.setBounds(530, 183, 324, 79);
		frame.getContentPane().add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Cadastrar Cargo");
		btnNewButton_1_1_1_1.setIcon(new ImageIcon(Menu.class.getResource("IconeCadastro.png")));
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_1_1.setBounds(88, 406, 324, 79);
		frame.getContentPane().add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Cadastrar Eleição");
		btnNewButton_1_1_1.setIcon(new ImageIcon(Menu.class.getResource("IconeCadastro.png")));
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_1.setBounds(88, 294, 324, 79);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Cadastrar Candidato");
		btnNewButton_1_1.setIcon(new ImageIcon(Menu.class.getResource("IconeCadastro.png")));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(88, 183, 324, 79);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("Cadastrar Eleitor");
		btnNewButton_1.setIcon(new ImageIcon(Menu.class.getResource("IconeCadastro.png")));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(88, 69, 324, 79);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnUrna = new JButton("Urna");
		btnUrna.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUrna.setIcon(new ImageIcon(Menu.class.getResource("IconeUrna.png")));
		btnUrna.setBounds(530, 69, 147, 79);
		frame.getContentPane().add(btnUrna);
		btnNewButton.setIcon(new ImageIcon(Menu.class.getResource("IconeRelatorio.png")));
		btnNewButton.setBounds(703, 69, 147, 79);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1009, 537);
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("TelaMenu.png")));
		frame.getContentPane().add(lblNewLabel);
	}
	
	public void start() {
		frame.setVisible(true);
	}
}
