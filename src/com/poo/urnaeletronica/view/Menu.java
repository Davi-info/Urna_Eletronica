package com.poo.urnaeletronica.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Menu extends JFrame{

	//private JFrame frame;

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
		//frame = new JFrame();
		setTitle("Tela de Menu");
		setBounds(100, 100, 1025, 576);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnRelatorio = new JButton("Relatório");
		btnRelatorio.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRelatorio.setIcon(new ImageIcon(Menu.class.getResource("../images/IconeRelatorio.png")));
		btnRelatorio.setBounds(703, 69, 147, 79);
		getContentPane().add(btnRelatorio);
		btnRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSair.setBounds(637, 406, 125, 79);
		getContentPane().add(btnSair);
		btnSair.addActionListener(e -> System.exit(0));
		
		JButton btnLimpar = new JButton("Limpar Dados do Banco");
		btnLimpar.setIcon(new ImageIcon(Menu.class.getResource("../images/IconeLimpaDados.png")));
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLimpar.setBounds(530, 183, 324, 79);
		getContentPane().add(btnLimpar);
		
		JButton btnCadastrarCargo = new JButton("Cadastrar Cargo");
		btnCadastrarCargo.setIcon(new ImageIcon(Menu.class.getResource("../images/IconeCadastro.png")));
		btnCadastrarCargo.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCadastrarCargo.setBounds(88, 406, 324, 79);
		getContentPane().add(btnCadastrarCargo);

		btnCadastrarCargo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarCargo cadastrarCargo = new CadastrarCargo(); // Cria a tela de cadastro de cargo
				cadastrarCargo.setVisible(true); // Torna a tela visível
			}
		});

		
		JButton btnCadastrarEleicao = new JButton("Cadastrar Eleição");
		btnCadastrarEleicao.setIcon(new ImageIcon(Menu.class.getResource("../images/IconeCadastro.png")));
		btnCadastrarEleicao.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCadastrarEleicao.setBounds(88, 294, 324, 79);
		getContentPane().add(btnCadastrarEleicao);

		btnCadastrarEleicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarEleicao cadastrarEleicao = new CadastrarEleicao(); // Cria a tela de cadastro de cargo
				cadastrarEleicao.setVisible(true); // Torna a tela visível
			}
		});
		
		JButton btnCadastrarCandidato = new JButton("Cadastrar Candidato");
		btnCadastrarCandidato.setIcon(new ImageIcon(Menu.class.getResource("../images/IconeCadastro.png")));
		btnCadastrarCandidato.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCadastrarCandidato.setBounds(88, 183, 324, 79);
		getContentPane().add(btnCadastrarCandidato);

		btnCadastrarCandidato.addActionListener(new ActionListener() {	
		public void actionPerformed(ActionEvent e) {
			CadastrarCandidato cadastrarCandidato = new CadastrarCandidato(); // Cria a tela de cadastro de cargo
			cadastrarCandidato.setVisible(true); // Torna a tela visível
			}
		});

		
		JButton btnCadastrarEleitor = new JButton("Cadastrar Eleitor");
		btnCadastrarEleitor.setIcon(new ImageIcon(Menu.class.getResource("../images/IconeCadastro.png")));
		btnCadastrarEleitor.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCadastrarEleitor.setBounds(88, 69, 324, 79);
		getContentPane().add(btnCadastrarEleitor);

		btnCadastrarEleitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarEleitor cadastrarEleitor = new CadastrarEleitor(); // Cria a tela de cadastro de cargo
				cadastrarEleitor.setVisible(true); // Torna a tela visível
			}
		});
		
		JButton btnUrnaEletronica = new JButton("Urna");
		btnUrnaEletronica.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUrnaEletronica.setIcon(new ImageIcon(Menu.class.getResource("../images/IconeUrna.png")));
		btnUrnaEletronica.setBounds(530, 69, 147, 79);
		getContentPane().add(btnUrnaEletronica);

		btnUrnaEletronica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UrnaEletronica urnaEletronica = new UrnaEletronica(); // Cria a tela de cadastro de cargo
				urnaEletronica.setVisible(true); // Torna a tela visível
			}
		});
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1009, 537);
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("../images/TelaMenu.png")));
		getContentPane().add(lblNewLabel);
	}

		
	public void start() {
		setVisible(true);
	}
}
