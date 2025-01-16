package com.poo.urnaeletronica.controller;

import com.poo.urnaeletronica.model.Candidato;
import com.poo.urnaeletronica.view.CandidatoView;

import java.util.ArrayList;

public class CandidatoController {
    private ArrayList<Candidato> candidatos = new ArrayList<>();
    private CandidatoView candidatoView;

    public CandidatoController(CandidatoView candidatoView) {
        this.candidatoView = candidatoView;
    }

    public void cadastrarCandidato() {
        do {
            int id = candidatoView.inputNumero();
            String nome = candidatoView.inputNome();
//            String cargo = candidatoView.inputCargo();
            String partido = candidatoView.inputPartido();

            Candidato candidato = new Candidato(id, nome, partido);
            candidatos.add(candidato);

        } while (candidatoView.continuaCadastrando());
    }

    public void listarCandidatos() {
        System.out.println("\nMostrando todas as informações dos candidatos: ");
        for (Candidato candidato : candidatos) {
            CandidatoView.mostraInformacaoCandidato(candidato);
        }
    }
}
