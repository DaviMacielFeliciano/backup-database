package br.com.davi.aula.appminhaideiadb.model;

import android.util.Log;

import br.com.davi.aula.appminhaideiadb.api.AppUtil;
import br.com.davi.aula.appminhaideiadb.controller.ICrud;

public class Cliente {

    private int id; // Chave primária no Banco de Dados
    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
