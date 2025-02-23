package com.senai.controledeacesso;

import java.io.IOException;

public class VerificarEstruturaDeDiretorios {
    public static void verificarEstruturaDeDiretorios() {
        // Verifica se a pasta ControleDeAcesso existe, caso contrário, cria
        if (!ControleDeAcesso.pastaControleDeAcesso.exists()) {
            if (ControleDeAcesso.pastaControleDeAcesso.mkdir()) {
                System.out.println("Pasta ControleDeAcesso criada com sucesso.");
            } else {
                System.out.println("Falha ao criar a pasta ControleDeAcesso.");
            }
        }

        // Verifica se o arquivo bancoDeDados.txt existe, caso contrário, cria
        if (!ControleDeAcesso.arquivoBancoDeDados.exists()) {
            try {
                if (ControleDeAcesso.arquivoBancoDeDados.createNewFile()) {
                    System.out.println("Arquivo bancoDeDados.txt criado com sucesso.");
                } else {
                    System.out.println("Falha ao criar o arquivo bancoDeDados.txt.");
                }
            } catch (IOException e) {
                System.out.println("Erro ao criar arquivo bancoDeDados.txt: " + e.getMessage());
            }
        }

        // Verifica se a pasta imagens existe, caso contrário, cria
        if (!ControleDeAcesso.pastaImagens.exists()) {
            if (ControleDeAcesso.pastaImagens.mkdir()) {
                System.out.println("Pasta imagens criada com sucesso.");
            } else {
                System.out.println("Falha ao criar a pasta imagens.");
            }
        }
    }
}
