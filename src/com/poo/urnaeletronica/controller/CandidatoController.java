package com.poo.urnaeletronica.controller;

import com.poo.urnaeletronica.model.Candidato;
import com.poo.urnaeletronica.model.Cargo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CandidatoController {
    private List<Candidato> candidatos = new ArrayList<>();

    // Adiciona um novo candidato
    public void adicionarCandidato(int id, String nome, Cargo cargo, String partido) {
        Candidato candidato = new Candidato(id, nome, cargo, partido);
        candidatos.add(candidato);
        JOptionPane.showMessageDialog(null, "Candidato cadastrado com sucesso!");
    }

    // Busca um candidato pelo ID
    public Candidato buscarCandidato(int id) {
        for (Candidato candidato : candidatos) {
            if (candidato.getId() == id) {
                return candidato;
            }
        }
        return null;
    }

    // Exclui um candidato pelo ID
    public boolean excluirCandidato(int id) {
        Candidato candidato = buscarCandidato(id);
        if (candidato != null) {
            candidatos.remove(candidato);
            JOptionPane.showMessageDialog(null, "Candidato removido com sucesso!");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Candidato não encontrado!");
            return false;
        }
    }

    // Retorna a lista de candidatos
    public List<Candidato> listarCandidatos() {
        return candidatos;
    }

}
