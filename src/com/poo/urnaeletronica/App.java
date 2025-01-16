package com.poo.urnaeletronica;

import com.poo.urnaeletronica.controller.CandidatoController;
import com.poo.urnaeletronica.enums.TipoEleicao;
import com.poo.urnaeletronica.model.Cargo;
import com.poo.urnaeletronica.model.Eleicao;
import com.poo.urnaeletronica.model.Candidato;
import com.poo.urnaeletronica.model.Eleitor;
import com.poo.urnaeletronica.model.Voto;
import com.poo.urnaeletronica.view.CandidatoView;

import javax.swing.JOptionPane;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        Cargo cargoPresidente = new Cargo("Presidente", 1);

        CandidatoView candidatoView = new CandidatoView();

        CandidatoController candidatoController = new CandidatoController(candidatoView);

        candidatoController.cadastrarCandidato();
        candidatoController.listarCandidatos();
    }
}
