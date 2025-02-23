package com.senai.controledeacesso;

public class ExibirCadastro {
    public static void exibirCadastro(){
        for (User user: User.userArrayList
             ) {System.out.println(user);}
    }
}
