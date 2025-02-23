package com.senai.controledeacesso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CarregarDadosDoArquivo {
    public static void carregarDadosDoArquivo() {


            try (BufferedReader reader = new BufferedReader(new FileReader(ControleDeAcesso.arquivoBancoDeDados))) {
                String linha;

                while ((linha = reader.readLine()) != null) {
                    if (!linha.trim().isEmpty()) {
                        String[] dados = linha.split(",");

                        if (dados.length == 6) {
                            User usuario = new User(dados[0], dados[1], dados[2], dados[3], dados[4], dados[5]);
                            User.userArrayList.add(usuario);
                        }
                    }
                }

            } catch (IOException e) {
                throw new RuntimeException("Erro ao carregar os dados do arquivo!", e);
            }
        }
    }


