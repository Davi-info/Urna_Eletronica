package com.poo.urnaeletronica.service;

import java.util.ArrayList;
import java.util.List;

import com.poo.urnaeletronica.model.Eleicao;

public class EleicaoService { 
    private int duration;
    private List<Eleicao> elecoes;

    public EleicaoService(int duration) {
        this.duration = duration;
        this.elecoes = new ArrayList<Eleicao>();
    }
}
