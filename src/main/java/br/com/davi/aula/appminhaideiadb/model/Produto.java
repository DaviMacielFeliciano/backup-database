package br.com.davi.aula.appminhaideiadb.model;

import android.util.Log;

import br.com.davi.aula.appminhaideiadb.api.AppUtil;
import br.com.davi.aula.appminhaideiadb.controller.ICrud;

public class Produto {

    private int ID;
    private String nome;
    private String fornecedor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
