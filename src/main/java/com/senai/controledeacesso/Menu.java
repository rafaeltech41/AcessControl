package com.senai.controledeacesso;

import java.util.Scanner;

public class Menu {
    public static void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            String menu = """
                    _________________________________________________________
                    |   Escolha uma opção:                                  |
                    |       1- Exibir cadastro completo                     |
                    |       2- Inserir novo cadastro                        |
                    |       3- Atualizar cadastro por id                    |
                    |       4- Deletar um cadastro por id                   |
                    |       5- Associar TAG ou cartão de acesso ao usuário  |
                    |       6- Sair                                         |
                    _________________________________________________________
                    """;
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1->
                    ExibirCadastro.exibirCadastro();

                case 2->
                 CadastrarUsuario.cadastrarUsuario();

                case 3->
                        AtualizarUsuario.atualizarUsuario();

                case 4->
                    DeletarUsuario.deletarUsuario();

                case 5->
                    AguardarCadastroDeIdAcesso.aguardarCadastroDeIdAcesso();

                case 6->
                    System.out.println("Fim do programa!");

                default->
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);
    }
}
