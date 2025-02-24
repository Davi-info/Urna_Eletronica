package com.poo.urnaeletronica.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.poo.urnaeletronica.components.Botao;
import com.poo.urnaeletronica.components.CampoDeTexto;
import com.poo.urnaeletronica.components.Etiqueta;

public class CadastrarEleicao extends JFrame {

	//private JFrame frame;
	private CampoDeTexto tituloEleicao;
	private CampoDeTexto dataInicio;
	private CampoDeTexto dataFim;
	private CampoDeTexto tipoEleicao;

	/**
	 * Create the application.
	 */
	public CadastrarEleicao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("Cadastrar Eleição");
		setBounds(100, 100, 1025, 576);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(570, 252, 404, 34);
		getContentPane().add(comboBox_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(570, 166, 404, 34);
		getContentPane().add(comboBox);
		
		Etiqueta lblListadeEleitores = new Etiqueta("Lista de Eleitores", 570, 211, 161, 40);
		getContentPane().add(lblListadeEleitores);
		
		Etiqueta lblListadeCandidatos = new Etiqueta("Lista de Candidatos", 570, 115, 190, 40);
		getContentPane().add(lblListadeCandidatos);
		
		Botao btnSair = new Botao("Sair", 825, 444, 94, 34, e -> System.exit(0));
		getContentPane().add(btnSair);
		
		Botao btnVoltar = new Botao("Voltar", 629, 444, 102, 34, e -> {
			dispose(); // Fecha a janela atual
			Menu telaMenu = new Menu(); // Cria uma instância da tela anterior
			telaMenu.setVisible(false); // Exibe a tela anterior
		});
		getContentPane().add(btnVoltar);
		
		Botao btnVisualizarEleicao = new Botao("Visualizar", 28, 444, 102, 34, e -> {
			VisualizarEleicao visualizarEleicao = new VisualizarEleicao(); // Cria a tela de cadastro de cargo
			visualizarEleicao.setVisible(true); // Torna a tela visível
		});
		getContentPane().add(btnVisualizarEleicao);

		Botao btnExcluir = new Botao("Excluir", 28, 348, 102, 34, e -> {});
		getContentPane().add(btnExcluir);
		
		Botao btnBusca = new Botao("Buscar", 28, 252, 102, 34, e -> {});
		getContentPane().add(btnBusca);
		
		Botao btnSalvar = new Botao("Salvar", 28, 166, 102, 34, e -> {});
		getContentPane().add(btnSalvar);
		
		tipoEleicao = new CampoDeTexto(10, 173, 444, 364, 34);
		getContentPane().add(tipoEleicao);
		
		Etiqueta lblTipodeEleição = new Etiqueta("Tipo de Eleição", 173, 393, 161, 40);
		getContentPane().add(lblTipodeEleição);
		
		Etiqueta lblDatadoFim = new Etiqueta("Data do Fim", 173, 297, 161, 40);
		getContentPane().add(lblDatadoFim);
		
		dataFim = new CampoDeTexto(10, 173, 348, 364, 34);
		getContentPane().add(dataFim);
		
		Etiqueta lblDatadoInício = new Etiqueta("Data do Início", 173, 211, 161, 40);
		getContentPane().add(lblDatadoInício);
		
		dataInicio = new CampoDeTexto(10, 173, 252, 364, 34);
		getContentPane().add(dataInicio);
		
		tituloEleicao = new CampoDeTexto(10, 173, 166, 364, 34);
		getContentPane().add(tituloEleicao);
		
		Etiqueta lblNome = new Etiqueta("Nome", 173, 115, 161, 40);
		getContentPane().add(lblNome);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 1009, 92);
		getContentPane().add(panel);
		
		JLabel lblTitulo = new JLabel("CADASTRO DA ELEIÇÃO");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel.add(lblTitulo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, -11, 1009, 558);
		lblNewLabel.setIcon(new ImageIcon(CadastrarEleitor.class.getResource("../images/TelaMenu.png")));
		getContentPane().add(lblNewLabel);
	}

	public void start() {
		setVisible(true);
	}
}
