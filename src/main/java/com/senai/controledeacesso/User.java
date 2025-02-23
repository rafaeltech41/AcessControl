package com.senai.controledeacesso;

import java.util.ArrayList;

public record User(String ID, String IdAcesso, String Nome, String Telefone, String Email, String imagem) {

static ArrayList<User> userArrayList = new ArrayList<>();
    public User(String ID, String IdAcesso, String Nome, String Telefone, String Email, String imagem) {
        this.ID = ID;
        this.IdAcesso = IdAcesso;
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.Email = Email;
        this.imagem = imagem;
    }
}
