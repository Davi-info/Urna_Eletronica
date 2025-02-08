package com.poo.urnaeletronica.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastrarEleicao extends JFrame {

	//private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		
		JLabel lblListadeEleitores = new JLabel("Lista de Eleitores");
		lblListadeEleitores.setForeground(Color.WHITE);
		lblListadeEleitores.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblListadeEleitores.setBounds(570, 211, 161, 40);
		getContentPane().add(lblListadeEleitores);
		
		JLabel lblListadeCandidatos = new JLabel("Lista de Candidatos");
		lblListadeCandidatos.setForeground(Color.WHITE);
		lblListadeCandidatos.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblListadeCandidatos.setBounds(570, 115, 190, 40);
		getContentPane().add(lblListadeCandidatos);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSair.setBounds(738, 492, 94, 34);
		getContentPane().add(btnSair);
		btnSair.addActionListener(e -> System.exit(0));
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVoltar.setBounds(607, 492, 102, 34);
		getContentPane().add(btnVoltar);
		
		btnVoltar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        dispose(); // Fecha a janela atual
		        Menu telaMenu = new Menu(); // Cria uma instância da tela anterior
		        telaMenu.setVisible(false); // Exibe a tela anterior
		    }
		});
		
		
		JButton btnVisualizarEleicao = new JButton("Visualizar");
		btnVisualizarEleicao.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVisualizarEleicao.setBounds(28, 444, 102, 34);
		getContentPane().add(btnVisualizarEleicao);

		btnVisualizarEleicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VisualizarEleicao visualizarEleicao = new VisualizarEleicao(); // Cria a tela de cadastro de cargo
				visualizarEleicao.setVisible(true); // Torna a tela visível
			}
		});
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExcluir.setBounds(28, 348, 102, 34);
		getContentPane().add(btnExcluir);
		
		JButton btnBusca = new JButton("Buscar");
		btnBusca.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBusca.setBounds(28, 252, 102, 34);
		getContentPane().add(btnBusca);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSalvar.setBounds(28, 166, 102, 34);
		getContentPane().add(btnSalvar);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(173, 444, 364, 34);
		getContentPane().add(textField_3);
		
		JLabel lblTipodeEleição = new JLabel("Tipo de Eleição");
		lblTipodeEleição.setForeground(Color.WHITE);
		lblTipodeEleição.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTipodeEleição.setBounds(173, 393, 161, 40);
		getContentPane().add(lblTipodeEleição);
		
		JLabel lblDatadoFim = new JLabel("Data do Fim");
		lblDatadoFim.setForeground(Color.WHITE);
		lblDatadoFim.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDatadoFim.setBounds(173, 297, 161, 40);
		getContentPane().add(lblDatadoFim);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(173, 348, 364, 34);
		getContentPane().add(textField_2);
		
		JLabel lblDatadoInício = new JLabel("Data do Início");
		lblDatadoInício.setForeground(Color.WHITE);
		lblDatadoInício.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDatadoInício.setBounds(173, 211, 161, 40);
		getContentPane().add(lblDatadoInício);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(173, 252, 364, 34);
		getContentPane().add(textField_1);
		
		textField = new JTextField();
		textField.setBounds(173, 166, 364, 34);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNome.setForeground(new Color(255, 255, 255));
		lblNome.setBounds(173, 115, 161, 40);
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
		lblNewLabel.setIcon(new ImageIcon(CadastrarEleitor.class.getResource("TelaMenu.png")));
		getContentPane().add(lblNewLabel);
	}

	public void start() {
		setVisible(true);
	}
}
