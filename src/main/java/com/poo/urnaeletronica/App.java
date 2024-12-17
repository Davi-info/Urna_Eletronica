package com.poo.urnaeletronica;

import javax.swing.JOptionPane;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Eleicao eleicao = new Eleicao(1, "Eleição 2024");
        Cargo presidente = new Cargo("Presidente", 1);
        Candidato candidato1 = new Candidato(1, "Candidato Bob Esponja", presidente, "Partido Esponjas");
        Candidato candidato2 = new Candidato(2, "Candidato Seu Serigueijo", presidente, "Partido Dinheiro");
        eleicao.cadastrarCandidato(candidato1);
        eleicao.cadastrarCandidato(candidato2);

        Eleitor eleitor = new Eleitor(1, "Maria");

        while (true) {
            // Exibir lista de candidatos
            StringBuilder mensagem = new StringBuilder("Escolha um candidato:\n");
            List<Candidato> candidatos = eleicao.getCandidatos();
            for (Candidato c : candidatos) {
                mensagem.append("ID: ").append(c.getId())
                        .append(" - Nome: ").append(c.getNome())
                        .append(" - Partido: ").append(c.getPartido())
                        .append("\n");
            }
            mensagem.append("Digite -1 para sair.");

            // Exibir popup para escolha
            String escolhaStr = JOptionPane.showInputDialog(null, mensagem.toString(),
                    "Votação", JOptionPane.INFORMATION_MESSAGE);

            // Verificar se o usuário cancelou ou digitou -1
            if (escolhaStr == null || escolhaStr.equals("-1")) {
                JOptionPane.showMessageDialog(null, "Votação encerrada.", "Encerrado",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            }

            try {
                int escolha = Integer.parseInt(escolhaStr);
                boolean votoConfirmado = false;

                for (Candidato c : candidatos) {
                    if (c.getId() == escolha) {
                        eleitor.confirmarVoto(new Voto(TipoVoto.VOTO_VALIDO, c));
                        JOptionPane.showMessageDialog(null, "Voto confirmado para: " + c.getNome(),
                                "Voto Registrado", JOptionPane.INFORMATION_MESSAGE);
                        votoConfirmado = true;
                        break;
                    }
                }

                if (!votoConfirmado) {
                    JOptionPane.showMessageDialog(null, "Candidato não encontrado. Tente novamente.",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite apenas números.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
