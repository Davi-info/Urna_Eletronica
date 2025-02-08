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
import javax.swing.JComboBox;

public class CadastrarCandidato extends JFrame {

	//private JFrame frame;
	private JTextField textField;
	private JComboBox textField_1;
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
		setTitle("Cadastrar Candidato");
		setBounds(100, 100, 1025, 576);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSair.setBounds(806, 492, 94, 34);
		getContentPane().add(btnSair);
		btnSair.addActionListener(e -> System.exit(0));
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVoltar.setBounds(694, 492, 102, 34);
		getContentPane().add(btnVoltar);
		
		btnVoltar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        dispose(); // Fecha a janela atual
		        Menu telaMenu = new Menu(); // Cria uma instância da tela anterior
		        telaMenu.setVisible(false); // Exibe a tela anterior
		    }
		});
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(694, 166, 205, 251);
		getContentPane().add(panel_1);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnProcurar.setBounds(435, 492, 102, 34);
		getContentPane().add(btnProcurar);
		
		JButton btnVisualizarCandidato = new JButton("Visualizar");
		btnVisualizarCandidato.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVisualizarCandidato.setBounds(28, 444, 102, 34);
		getContentPane().add(btnVisualizarCandidato);

		btnVisualizarCandidato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VisualizarCandidato visualizarCandidato = new VisualizarCandidato(); // Cria a tela de cadastro de cargo
				visualizarCandidato.setVisible(true); // Torna a tela visível
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
		
		JLabel lblFoto = new JLabel("Foto");
		lblFoto.setForeground(Color.WHITE);
		lblFoto.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFoto.setBounds(173, 393, 161, 40);
		getContentPane().add(lblFoto);
		
		JLabel lblPartido = new JLabel("Partido");
		lblPartido.setForeground(Color.WHITE);
		lblPartido.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPartido.setBounds(173, 297, 161, 40);
		getContentPane().add(lblPartido);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(173, 348, 364, 34);
		getContentPane().add(textField_2);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setForeground(Color.WHITE);
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCargo.setBounds(173, 211, 161, 40);
		getContentPane().add(lblCargo);
		
		textField_1 = new JComboBox();
		textField_1.setBounds(173, 252, 364, 34);
		getContentPane().add(textField_1);
		
		textField = new JTextField();
		textField.setBounds(173, 166, 364, 34);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNomedoCandidato = new JLabel("Nome do Candidato");
		lblNomedoCandidato.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNomedoCandidato.setForeground(new Color(255, 255, 255));
		lblNomedoCandidato.setBounds(173, 115, 188, 40);
		getContentPane().add(lblNomedoCandidato);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 1009, 92);
		getContentPane().add(panel);
		
		JLabel lblCadastroDoCandidato = new JLabel("CADASTRO DO CANDIDATO");
		lblCadastroDoCandidato.setForeground(new Color(255, 255, 255));
		lblCadastroDoCandidato.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel.add(lblCadastroDoCandidato);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1009, 547);
		lblNewLabel.setIcon(new ImageIcon(CadastrarEleitor.class.getResource("TelaMenu.png")));
		getContentPane().add(lblNewLabel);
	}
	
	public void start() {
		setVisible(true);
	}
}
