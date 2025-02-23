package com.senai.controledeacesso;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SalvarDadosNoArquivo {
    public static void salvarDadosNoArquivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ControleDeAcesso.arquivoBancoDeDados))) {

            for (User user : User.userArrayList) {
                writer.write(String.join(",", user.ID(),user.IdAcesso(), user.Nome(),user.Telefone(),user.Email(),user.imagem() ) + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
