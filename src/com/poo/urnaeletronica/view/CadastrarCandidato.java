package com.poo.urnaeletronica.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSair.setBounds(806, 492, 94, 34);
		frame.getContentPane().add(btnSair);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVoltar.setBounds(694, 492, 102, 34);
		frame.getContentPane().add(btnVoltar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(694, 166, 205, 251);
		frame.getContentPane().add(panel_1);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnProcurar.setBounds(435, 492, 102, 34);
		frame.getContentPane().add(btnProcurar);
		
		JButton btnVisualizar = new JButton("Visualizar");
		btnVisualizar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVisualizar.setBounds(28, 444, 102, 34);
		frame.getContentPane().add(btnVisualizar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExcluir.setBounds(28, 348, 102, 34);
		frame.getContentPane().add(btnExcluir);
		
		JButton btnBusca = new JButton("Buscar");
		btnBusca.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBusca.setBounds(28, 252, 102, 34);
		frame.getContentPane().add(btnBusca);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSalvar.setBounds(28, 166, 102, 34);
		frame.getContentPane().add(btnSalvar);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(173, 444, 364, 34);
		frame.getContentPane().add(textField_3);
		
		JLabel lblFoto = new JLabel("Foto");
		lblFoto.setForeground(Color.WHITE);
		lblFoto.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFoto.setBounds(173, 393, 161, 40);
		frame.getContentPane().add(lblFoto);
		
		JLabel lblPartido = new JLabel("Partido");
		lblPartido.setForeground(Color.WHITE);
		lblPartido.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPartido.setBounds(173, 297, 161, 40);
		frame.getContentPane().add(lblPartido);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(173, 348, 364, 34);
		frame.getContentPane().add(textField_2);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setForeground(Color.WHITE);
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCargo.setBounds(173, 211, 161, 40);
		frame.getContentPane().add(lblCargo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(173, 252, 364, 34);
		frame.getContentPane().add(textField_1);
		
		textField = new JTextField();
		textField.setBounds(173, 166, 364, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNomedoCandidato = new JLabel("Nome do Candidato");
		lblNomedoCandidato.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNomedoCandidato.setForeground(new Color(255, 255, 255));
		lblNomedoCandidato.setBounds(173, 115, 188, 40);
		frame.getContentPane().add(lblNomedoCandidato);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 1009, 92);
		frame.getContentPane().add(panel);
		
		JLabel lblCadastroDoCandidato = new JLabel("CADASTRO DO CANDIDATO");
		lblCadastroDoCandidato.setForeground(new Color(255, 255, 255));
		lblCadastroDoCandidato.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel.add(lblCadastroDoCandidato);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1009, 547);
		lblNewLabel.setIcon(new ImageIcon(CadastrarEleitor.class.getResource("TelaMenu.png")));
		frame.getContentPane().add(lblNewLabel);
	}
	
	public void start() {
		frame.setVisible(true);
	}
}
