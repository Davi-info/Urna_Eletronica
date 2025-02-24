package com.poo.urnaeletronica.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.poo.urnaeletronica.components.Botao;


public class Menu extends JFrame{
	public Menu() {
		initialize();
	}

	private void initialize() {
		setTitle("Tela de Menu");
		setBounds(100, 100, 1025, 576);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		Botao btnRelatorio = new Botao("Relatório", 703, 69, 147, 79, e -> {});
		btnRelatorio.setIcon(new ImageIcon(Menu.class.getResource("../images/IconeRelatorio.png")));
		getContentPane().add(btnRelatorio);
		
		Botao btnSair = new Botao("Sair", 637, 406, 125, 79, e -> System.exit(0));
		getContentPane().add(btnSair);
		
		Botao btnLimpar = new Botao("Limpar Dados do Banco", 530, 183, 324, 79, e -> {});
		btnLimpar.setIcon(new ImageIcon(Menu.class.getResource("../images/IconeLimpaDados.png")));
		getContentPane().add(btnLimpar);
		
		Botao btnCadastrarCargo = new Botao("Cadastrar Cargo", 88, 406, 324, 79, e -> {
			CadastrarCargo cadastrarCargo = new CadastrarCargo(); // Cria a tela de cadastro de cargo
			cadastrarCargo.setVisible(true); // Torna a tela visível
		});
		btnCadastrarCargo.setIcon(new ImageIcon(Menu.class.getResource("../images/IconeCadastro.png")));
		getContentPane().add(btnCadastrarCargo);
		
		Botao btnCadastrarEleicao = new Botao("Cadastrar Eleição", 88, 294, 324, 79, e -> {
			CadastrarEleicao cadastrarEleicao = new CadastrarEleicao(); // Cria a tela de cadastro de cargo
			cadastrarEleicao.setVisible(true); // Torna a tela visível
		});
		btnCadastrarEleicao.setIcon(new ImageIcon(Menu.class.getResource("../images/IconeCadastro.png")));
		getContentPane().add(btnCadastrarEleicao);

		Botao btnCadastrarCandidato = new Botao("Cadastrar Candidato", 88, 183, 324, 79, e -> {
			CadastrarCandidato cadastrarCandidato = new CadastrarCandidato(); // Cria a tela de cadastro de cargo
			cadastrarCandidato.setVisible(true); // Torna a tela visível
			});
		btnCadastrarCandidato.setIcon(new ImageIcon(Menu.class.getResource("../images/IconeCadastro.png")));
		getContentPane().add(btnCadastrarCandidato);
		
		Botao btnCadastrarEleitor = new Botao("Cadastrar Eleitor", 88, 69, 324, 79, e -> {
			CadastrarEleitor cadastrarEleitor = new CadastrarEleitor(); // Cria a tela de cadastro de cargo
			cadastrarEleitor.setVisible(true); // Torna a tela visível
		});
		btnCadastrarEleitor.setIcon(new ImageIcon(Menu.class.getResource("../images/IconeCadastro.png")));
		getContentPane().add(btnCadastrarEleitor);

		Botao btnUrnaEletronica = new Botao("Urna", 530, 69, 147, 79, e -> {
			UrnaEletronica urnaEletronica = new UrnaEletronica(); // Cria a tela de cadastro de cargo
			urnaEletronica.setVisible(true); // Torna a tela visível
		});
		btnUrnaEletronica.setIcon(new ImageIcon(Menu.class.getResource("../images/IconeUrna.png")));
		getContentPane().add(btnUrnaEletronica);
		
		JLabel imagemDeFundo = new JLabel("Imagem de fundo");
		imagemDeFundo.setBounds(0, 0, 1009, 537);
		imagemDeFundo.setIcon(new ImageIcon(Menu.class.getResource("../images/TelaMenu.png")));
		getContentPane().add(imagemDeFundo);
	}

		
	public void start() {
		setVisible(true);
	}
}
