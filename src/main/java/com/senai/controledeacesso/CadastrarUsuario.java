package com.senai.controledeacesso;

import java.util.Arrays;
import java.util.Scanner;

public class CadastrarUsuario {
    public static void cadastrarUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de usuarios que deseja cadastrar:");
        int qtdUsuarios = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < qtdUsuarios; i++) {
            System.out.println("Id:");
            String ID = scanner.nextLine();
            System.out.println("Id Acesso");
            String IdAcesso = scanner.nextLine();
            System.out.println("Nome");
            String Nome = scanner.nextLine();
            System.out.println("Telefone");
            String Telefone = scanner.nextLine();

            System.out.println("Email");
            String Email = scanner.nextLine();
            String imagem = "-";
            User.userArrayList.add(new User(ID, IdAcesso, Nome,  Telefone, Email,  imagem));
            System.out.println("-----------------------Inserido com sucesso------------------------\n");
            SalvarDadosNoArquivo.salvarDadosNoArquivo();
        }

    }
}
