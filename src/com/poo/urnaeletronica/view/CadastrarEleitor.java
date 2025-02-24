package com.poo.urnaeletronica.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastrarEleitor extends JFrame {

	//private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the application.
	 */
	public CadastrarEleitor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//frame = new JFrame();
		setTitle("Cadastrar Eleição");
		setBounds(100, 100, 1025, 576);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(CadastrarEleitor.class.getResource("/com/poo/urnaeletronica/view/candidate.jpg")));
		lblNewLabel_1.setBounds(739, 166, 153, 171);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSair.setBounds(443, 444, 94, 34);
		getContentPane().add(btnSair);
		btnSair.addActionListener(e -> System.exit(0));
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVoltar.setBounds(232, 444, 102, 34);
		getContentPane().add(btnVoltar);
		
		btnVoltar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        dispose(); // Fecha a janela atual
		        Menu telaMenu = new Menu(); // Cria uma instância da tela anterior
		        telaMenu.setVisible(false); // Exibe a tela anterior
		    }
		});
		
		JButton btnVisualizarEleitor = new JButton("Visualizar");
		btnVisualizarEleitor.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVisualizarEleitor.setBounds(28, 444, 102, 34);
		getContentPane().add(btnVisualizarEleitor);

		btnVisualizarEleitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VisualizarEleitor visualizarEleitor = new VisualizarEleitor(); // Cria a tela de cadastro de cargo
				visualizarEleitor.setVisible(true); // Torna a tela visível
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
		
		JLabel lblDatadoVoto = new JLabel("Data do Voto");
		lblDatadoVoto.setForeground(Color.WHITE);
		lblDatadoVoto.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDatadoVoto.setBounds(173, 297, 161, 40);
		getContentPane().add(lblDatadoVoto);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(173, 348, 364, 34);
		getContentPane().add(textField_2);
		
		JLabel lblVoto = new JLabel("Voto");
		lblVoto.setForeground(Color.WHITE);
		lblVoto.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblVoto.setBounds(173, 211, 161, 40);
		getContentPane().add(lblVoto);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(173, 252, 364, 34);
		getContentPane().add(textField_1);
		
		textField = new JTextField();
		textField.setBounds(173, 166, 364, 34);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome do Eleitor");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNome.setForeground(new Color(255, 255, 255));
		lblNome.setBounds(173, 115, 161, 40);
		getContentPane().add(lblNome);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 1009, 92);
		getContentPane().add(panel);
		
		JLabel lblTitulo = new JLabel("CADASTRO DO ELEITOR");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel.add(lblTitulo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1009, 558);
		lblNewLabel.setIcon(new ImageIcon(CadastrarEleitor.class.getResource("TelaMenu.png")));
		getContentPane().add(lblNewLabel);
	}

	public void start() {
		setVisible(true);
	}
}
