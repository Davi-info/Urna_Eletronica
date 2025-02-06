package com.poo.urnaeletronica.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
		
		JButton btnRelatorio = new JButton("Relatório");
		btnRelatorio.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSair.setBounds(637, 406, 125, 79);
		frame.getContentPane().add(btnSair);
		
		JButton btnLimpar = new JButton("Limpar Dados do Banco");
		btnLimpar.setIcon(new ImageIcon(Menu.class.getResource("IconeLimpaDados.png")));
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLimpar.setBounds(530, 183, 324, 79);
		frame.getContentPane().add(btnLimpar);
		
		JButton btnCadastrarCargo = new JButton("Cadastrar Cargo");
		btnCadastrarCargo.setIcon(new ImageIcon(Menu.class.getResource("IconeCadastro.png")));
		btnCadastrarCargo.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCadastrarCargo.setBounds(88, 406, 324, 79);
		frame.getContentPane().add(btnCadastrarCargo);
		
		JButton btnCadastrarEleicao = new JButton("Cadastrar Eleição");
		btnCadastrarEleicao.setIcon(new ImageIcon(Menu.class.getResource("IconeCadastro.png")));
		btnCadastrarEleicao.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCadastrarEleicao.setBounds(88, 294, 324, 79);
		frame.getContentPane().add(btnCadastrarEleicao);
		
		JButton btnCadastrarCandidato = new JButton("Cadastrar Candidato");
		btnCadastrarCandidato.setIcon(new ImageIcon(Menu.class.getResource("IconeCadastro.png")));
		btnCadastrarCandidato.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCadastrarCandidato.setBounds(88, 183, 324, 79);
		frame.getContentPane().add(btnCadastrarCandidato);
		
		JButton btnCadastrarEleitor = new JButton("Cadastrar Eleitor");
		btnCadastrarEleitor.setIcon(new ImageIcon(Menu.class.getResource("IconeCadastro.png")));
		btnCadastrarEleitor.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCadastrarEleitor.setBounds(88, 69, 324, 79);
		frame.getContentPane().add(btnCadastrarEleitor);
		
		JButton btnUrna = new JButton("Urna");
		btnUrna.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUrna.setIcon(new ImageIcon(Menu.class.getResource("IconeUrna.png")));
		btnUrna.setBounds(530, 69, 147, 79);
		frame.getContentPane().add(btnUrna);
		btnRelatorio.setIcon(new ImageIcon(Menu.class.getResource("IconeRelatorio.png")));
		btnRelatorio.setBounds(703, 69, 147, 79);
		frame.getContentPane().add(btnRelatorio);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1009, 537);
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("TelaMenu.png")));
		frame.getContentPane().add(lblNewLabel);
	}
	
	public void start() {
		frame.setVisible(true);
	}
}
