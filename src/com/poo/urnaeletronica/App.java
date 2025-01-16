package com.poo.urnaeletronica;

import com.poo.urnaeletronica.enums.TipoEleicao;
import com.poo.urnaeletronica.model.Cargo;
import com.poo.urnaeletronica.model.Eleicao;
import com.poo.urnaeletronica.model.Candidato;
import com.poo.urnaeletronica.model.Eleitor;
import com.poo.urnaeletronica.model.Voto;

import javax.swing.JOptionPane;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Eleicao eleicao = new Eleicao(1, "Eleição 2024", TipoEleicao.MAJORITARIA);

        Cargo presidente = new Cargo("Presidente", 1);

        Candidato c1 = new Candidato(1,"Bob Esponja", presidente, "Partido das Esponjas");
        Candidato c2 = new Candidato(2, "Seu Siriguejo", presidente, "Partido do Dinheiro");

        Eleitor e1 = new Eleitor(1, "Maria");

        eleicao.cadastrarCandidato(c1);
        eleicao.cadastrarCandidato(c2);

        eleicao.cadastrarEleitor(e1);

        eleicao.listarCandidatos();
        eleicao.listarEleitores();
    }
}
