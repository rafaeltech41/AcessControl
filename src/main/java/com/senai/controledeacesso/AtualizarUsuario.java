package com.senai.controledeacesso;

import java.util.Scanner;

public class AtualizarUsuario {
    public static void atualizarUsuario() {
        Scanner scanner = new Scanner(System.in);
        ExibirCadastro.exibirCadastro();
        System.out.println("Escolha um id para atualizar o cadastro:");
        int idUsuario = scanner.nextInt();
        scanner.nextLine();
        System.out.println("\nAtualize os dados a seguir:");

        User.userArrayList.get(idUsuario);
//preciso atualizar utilizando o set para redefinir as informações da lista...

        System.out.println("---------Atualizado com sucesso-----------");
        ExibirCadastro.exibirCadastro();
        SalvarDadosNoArquivo.salvarDadosNoArquivo();
    }
}
