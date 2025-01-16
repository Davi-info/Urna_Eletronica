package com.poo.urnaeletronica.view;

import com.poo.urnaeletronica.model.Candidato;

import java.util.Scanner;

public class CandidatoView {
    private  Scanner scanner = new Scanner(System.in);

    public int inputNumero() {
        System.out.println("Digite o número do candidato(a)? ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String inputNome() {
        System.out.println("Digite o nome do candidato(a)? ");
        return scanner.nextLine();
    }

    public String inputCargo() {
        System.out.println("Digite o cargo do candidato(a)?");
        return scanner.nextLine();
    }

    public String inputPartido() {
        System.out.println("Digite o partido do candidato(a)?");
        return scanner.nextLine();
    }

    public boolean continuaCadastrando() {
        System.out.println("Desejar cadastrar mais candidatos?(sim/nao) ");
        String response = scanner.nextLine().toLowerCase();
        return response.equals("sim");
    }

    public static void mostraInformacaoCandidato(Candidato candidato) {
        System.out.println("\nInformação do candidato:");
        System.out.println("Número: " + candidato.getId());
        System.out.println("Nome: " + candidato.getNome());
//        System.out.println("Cargo: " + candidato.getCargo());
        System.out.println("Partido: " + candidato.getPartido());
    }

    public void close(){
        scanner.close();
    }
}
