package com.poo.urnaeletronica.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.poo.urnaeletronica.components.Botao;
import com.poo.urnaeletronica.components.CampoDeTexto;
import com.poo.urnaeletronica.components.Etiqueta;

public class CadastrarEleitor extends JFrame {

	//private JFrame frame;
	private CampoDeTexto nomeEleitor;
	private CampoDeTexto votoEleitor;
	private CampoDeTexto dataVoto;

	public CadastrarEleitor() {
		initialize();
	}

	private void initialize() {
		setTitle("Cadastrar Eleição");
		setBounds(100, 100, 1025, 576);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel imagemEleitor = new JLabel("Imagem eleitor");
		imagemEleitor.setIcon(new ImageIcon(CadastrarEleitor.class.getResource("../images/candidate.jpg")));
		imagemEleitor.setBounds(739, 166, 153, 171);
		getContentPane().add(imagemEleitor);
		
		Botao btnSair = new Botao("Sair", 443, 444, 94, 34, e -> System.exit(0));
		getContentPane().add(btnSair);
		
		Botao btnVoltar = new Botao("Voltar", 232, 444, 102, 34, e -> {
			dispose(); // Fecha a janela atual
			Menu telaMenu = new Menu(); // Cria uma instância da tela anterior
			telaMenu.setVisible(false); // Exibe a tela anterior
		});
		getContentPane().add(btnVoltar);
		
		Botao btnVisualizarEleitor = new Botao("Visualizar", 28, 444, 102, 34, e -> {
			VisualizarEleitor visualizarEleitor = new VisualizarEleitor(); // Cria a tela de cadastro de cargo
			visualizarEleitor.setVisible(true); // Torna a tela visível
		});
		getContentPane().add(btnVisualizarEleitor);
		
		Botao btnExcluir = new Botao("Excluir", 28, 348, 102, 34, e -> {});
		getContentPane().add(btnExcluir);
		
		Botao btnBusca = new Botao("Buscar", 28, 252, 102, 34, e -> {});
		getContentPane().add(btnBusca);
		
		Botao btnSalvar = new Botao("Salvar", 28, 166, 102, 34, e -> {});
		getContentPane().add(btnSalvar);
		
		Etiqueta lblDatadoVoto = new Etiqueta("Data do Voto", 173, 297, 161, 40);
		getContentPane().add(lblDatadoVoto);
		
		dataVoto = new CampoDeTexto(10, 173, 348, 364, 34);
		getContentPane().add(dataVoto);
		
		Etiqueta lblVoto = new Etiqueta("Voto", 173, 211, 161, 40);
		getContentPane().add(lblVoto);
		
		votoEleitor = new CampoDeTexto(10, 173, 252, 364, 34);
		getContentPane().add(votoEleitor);
		
		nomeEleitor = new CampoDeTexto(10, 173, 166, 364, 34);
		getContentPane().add(nomeEleitor);
		
		Etiqueta lblNome = new Etiqueta("Nome do Eleitor", 173, 115, 161, 40);
		getContentPane().add(lblNome);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 1009, 92);
		getContentPane().add(panel);
		
		JLabel lblTitulo = new JLabel("CADASTRO DO ELEITOR");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel.add(lblTitulo);
		
		JLabel imagemDeFundo = new JLabel("Imagem de fundo");
		imagemDeFundo.setBounds(0, -11, 1009, 558);
		imagemDeFundo.setIcon(new ImageIcon(CadastrarEleitor.class.getResource("../images/TelaMenu.png")));
		getContentPane().add(imagemDeFundo);
	}

	public void start() {
		setVisible(true);
	}
}
