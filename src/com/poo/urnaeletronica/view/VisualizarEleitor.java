package com.poo.urnaeletronica.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VisualizarEleitor extends JFrame {

	//private JFrame frame;
	private JTable table;

	/**
	 * Create the application.
	 */
	public VisualizarEleitor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("Cadastrar Eleitor");
		setBounds(100, 100, 1025, 576);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Eleitor", "Voto", "Data do Voto", "Foto"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(120); // "Candidato"
		table.getColumnModel().getColumn(1).setPreferredWidth(50); // "Cargo"
		table.getColumnModel().getColumn(2).setPreferredWidth(50); // "Partido"
		table.getColumnModel().getColumn(3).setPreferredWidth(75); // "Foto"
		

		table.setBounds(135, 148, 736, 75);
		// table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setRowHeight(20); // Define a altura das linhas para 30 pixels
		

		table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
		table.getTableHeader().setBackground(Color.LIGHT_GRAY); // Fundo cinza claro
        table.getTableHeader().setPreferredSize(new Dimension(50, 20));

		// Criando o JScrollPane e adicionando a tabela nele
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(118, 148, 753, 45);
		getContentPane().add(scrollPane);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(806, 492, 94, 34);
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(btnSair);
		btnSair.addActionListener(e -> System.exit(0));
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(694, 492, 102, 34);
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(btnVoltar);
		
		btnVoltar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        dispose(); // Fecha a janela atual
		        CadastrarEleitor cadastrarEleitor = new CadastrarEleitor(); // Cria uma instância da tela anterior
		        cadastrarEleitor.setVisible(false); // Exibe a tela anterior
		    }
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1009, 92);
		panel.setBackground(new Color(0, 0, 128));
		getContentPane().add(panel);
		
		JLabel lblEleitoresCadastrados = new JLabel("ELEITORES CADASTRADOS");
		lblEleitoresCadastrados.setForeground(new Color(255, 255, 255));
		lblEleitoresCadastrados.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel.add(lblEleitoresCadastrados);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(-16, -10, 1025, 547);
		lblNewLabel.setIcon(new ImageIcon(CadastrarEleitor.class.getResource("TelaMenu.png")));
		getContentPane().add(lblNewLabel);
	}

	public void start() {
		setVisible(true);
	}
}
