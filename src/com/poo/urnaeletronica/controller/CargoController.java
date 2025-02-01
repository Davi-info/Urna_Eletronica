package com.poo.urnaeletronica.controller;

import com.poo.urnaeletronica.model.Cargo;
import java.util.ArrayList;
import java.util.List;

public class CargoController {
    private List<Cargo> cargos;

    public CargoController() {
        this.cargos = new ArrayList<>();
    }

    public void cadastrarCargo(String nome, int numeroDeVagas) {
        Cargo cargo = new Cargo(nome, numeroDeVagas);
        cargos.add(cargo);
        System.out.println("Cargo cadastrado com sucesso: " + cargo);
    }

    public Cargo buscarCargo(String nome) {
        for (Cargo cargo : cargos) {
            if (cargo.getNome().equalsIgnoreCase(nome)) {
                return cargo;
            }
        }
        return null;
    }

    public boolean excluirCargo(String nome) {
        return cargos.removeIf(cargo -> cargo.getNome().equalsIgnoreCase(nome));
    }

    public List<Cargo> listarCargos() {
        return cargos;
    }
}
