package com.senai.controledeacesso;

public class Main {
    public static void main(String[] args) {
        Menu.menuPrincipal();
        CarregarDadosDoArquivo.carregarDadosDoArquivo();
        VerificarEstruturaDeDiretorios.verificarEstruturaDeDiretorios();
    }
}