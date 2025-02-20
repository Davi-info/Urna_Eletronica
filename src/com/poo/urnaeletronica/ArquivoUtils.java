package com.poo.urnaeletronica;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArquivoUtils {

    private static final String ARQUIVO_CANDIDATOS = "candidatos.txt";
    private static final String ARQUIVO_CARGOS = "cargos.txt";

    // Salvar candidato no arquivo
    public static void salvarCandidato(String nome, String cargo, String partido) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO_CANDIDATOS, true))) {
            writer.write(nome + ";" + cargo + ";" + partido);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar candidato: " + e.getMessage());
        }
    }

    // Ler todos os candidatos do arquivo
    public static List<String> lerCandidatos() {
        List<String> candidatos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_CANDIDATOS))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                candidatos.add(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar candidatos: " + e.getMessage());
        }
        return candidatos;
    }

    // Buscar um candidato específico
    public static String buscarCandidato(String nome) {
        List<String> candidatos = lerCandidatos();
        for (String candidato : candidatos) {
            String[] dados = candidato.split(";");
            if (dados.length == 3 && dados[0].equalsIgnoreCase(nome)) {
                return candidato;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Excluir um candidato pelo nome
    public static boolean excluirCandidato(String nome) {
        List<String> candidatos = lerCandidatos();
        boolean removido = candidatos.removeIf(c -> c.split(";")[0].equalsIgnoreCase(nome));

        if (removido) {
            salvarTodosCandidatos(candidatos); // Atualiza o arquivo
        }
        return removido;
    }

    private static void salvarTodosCandidatos(List<String> candidatos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO_CANDIDATOS))) {
            for (String candidato : candidatos) {
                writer.write(candidato);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao atualizar candidatos: " + e.getMessage());
        }
    }

    // Ler todos os cargos do arquivo
    public static List<String> lerCargos() {
        List<String> cargos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_CARGOS))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                cargos.add(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar cargos: " + e.getMessage());
        }
        return cargos;
    }
}
