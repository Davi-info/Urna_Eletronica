package com.poo.urnaeletronica.view;

import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.poo.urnaeletronica.ArquivoUtils;
import com.poo.urnaeletronica.components.Botao;
import com.poo.urnaeletronica.components.CampoDeTexto;
import com.poo.urnaeletronica.components.Etiqueta;

import javax.swing.JComboBox;

public class CadastrarCandidato extends JFrame {
	private CampoDeTexto nomeCandidato;
	private JComboBox cargoCandidato;
	private CampoDeTexto partidoCandidato;

	public CadastrarCandidato() {
		initialize();
	}

	private void initialize() {
		setTitle("Cadastrar Candidato");
		setBounds(100, 100, 1025, 576);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		// Imagem estatica de um candidato
		JLabel imagemCandidato = new JLabel("New label");
		imagemCandidato.setIcon(new ImageIcon(CadastrarCandidato.class.getResource("../images/candidate.jpg")));
		imagemCandidato.setBounds(750, 166, 153, 161);
		getContentPane().add(imagemCandidato);

		Botao btnSair = new Botao("Sair", 443, 444, 94, 34, e -> System.exit(0));
		getContentPane().add(btnSair);

		Botao btnVoltar = new Botao("Voltar", 239, 444, 102, 34, e -> {
			dispose(); // Fecha a janela atual
			Menu telaMenu = new Menu(); // Cria uma instância da tela anterior
			telaMenu.setVisible(false); // Exibe a tela anterior
		});
		getContentPane().add(btnVoltar);

		Botao btnVisualizarCandidato = new Botao("Visualizar", 28, 444, 102, 34, e -> {
			List<String> candidatos = ArquivoUtils.lerCandidatos();
			if (candidatos.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Nenhum candidato cadastrado.");
			} else {
				StringBuilder mensagem = new StringBuilder("Candidatos Cadastrados:\n");
				for (String candidato : candidatos) {
					String[] dados = candidato.split(";");
					if (dados.length == 3) { // Evita erro caso a linha esteja mal formatada
						mensagem.append("Nome: ").append(dados[0])
								.append(", Cargo: ").append(dados[1])
								.append(", Partido: ").append(dados[2])
								.append("\n");
					} else {
						mensagem.append("Candidato com dados inválidos: ").append(candidato).append("\n");
					}
				}
				JOptionPane.showMessageDialog(null, mensagem.toString());
			}
		});
		getContentPane().add(btnVisualizarCandidato);

		Botao btnExcluir = new Botao("Excluir", 28, 348, 102, 34, e -> {});
		
		getContentPane().add(btnExcluir);

		Botao btnBusca = new Botao("Buscar", 28, 252, 102, 34, e -> {});
		getContentPane().add(btnBusca);

		Botao btnSalvar = new Botao("Salvar", 28, 166, 102, 34, e -> {
			String nome = nomeCandidato.getText();
			String cargo = (String) cargoCandidato.getSelectedItem();
			String partido = partidoCandidato.getText();

			if (!nome.isEmpty() && cargo != null && !partido.isEmpty()) {
				ArquivoUtils.salvarCandidato(nome, cargo, partido);
				JOptionPane.showMessageDialog(null, "Candidato salvo com sucesso!");
			} else {
				JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
			}
		});
		getContentPane().add(btnSalvar);

		Etiqueta lblPartido = new Etiqueta("Partido", 173, 297, 161, 40);
		getContentPane().add(lblPartido);

		partidoCandidato = new CampoDeTexto(10, 173, 348, 364, 34);
		getContentPane().add(partidoCandidato);

		Etiqueta lblCargo = new Etiqueta("Cargo", 173, 211, 161, 40);
		getContentPane().add(lblCargo);

		cargoCandidato = new JComboBox();
		cargoCandidato.setBounds(173, 252, 364, 34);
		getContentPane().add(cargoCandidato);

		nomeCandidato = new CampoDeTexto(10, 173, 166, 364, 34);
		getContentPane().add(nomeCandidato);

		Etiqueta lblNomedoCandidato = new Etiqueta("Nome do Candidato", 173, 115, 188, 40);
		getContentPane().add(lblNomedoCandidato);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 1009, 92);
		getContentPane().add(panel);

		JLabel lblCadastroDoCandidato = new JLabel("CADASTRO DO CANDIDATO");
		lblCadastroDoCandidato.setForeground(new Color(255, 255, 255));
		lblCadastroDoCandidato.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel.add(lblCadastroDoCandidato);

		// Imagem de fundo
		JLabel imagemDeFundo = new JLabel("New label");
		imagemDeFundo.setBounds(0, 0, 1009, 547);
		imagemDeFundo.setIcon(new ImageIcon(CadastrarEleitor.class.getResource("../images/TelaMenu.png")));
		getContentPane().add(imagemDeFundo);
	}

	public void start() {
		setVisible(true);
	}
}
