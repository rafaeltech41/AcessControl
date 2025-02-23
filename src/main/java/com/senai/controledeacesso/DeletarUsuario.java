package com.senai.controledeacesso;

import java.util.Scanner;

public class DeletarUsuario {
    public static void deletarUsuario() {
        Scanner scanner = new Scanner(System.in);

        int idUsuario = ControleDeAcesso.idUsuarioRecebidoPorHTTP;
        if (idUsuario== 0) {
            ExibirCadastro.exibirCadastro();
            System.out.println("Escolha um id para deletar o cadastro:");
            idUsuario = scanner.nextInt();
            scanner.nextLine();
            //preciso fazer um code review aqui pois não sei o que vai aparecer no console..
            User.userArrayList.remove(idUsuario);
        }
        SalvarDadosNoArquivo.salvarDadosNoArquivo();
        System.out.println("-----------------------Deletado com sucesso------------------------\n");
        ControleDeAcesso.idUsuarioRecebidoPorHTTP = 0;
    }
}
