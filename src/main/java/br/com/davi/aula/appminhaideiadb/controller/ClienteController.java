package br.com.davi.aula.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import br.com.davi.aula.appminhaideiadb.api.AppUtil;
import br.com.davi.aula.appminhaideiadb.datamodel.ClienteDataModel;
import br.com.davi.aula.appminhaideiadb.datasource.AppDataBase;
import br.com.davi.aula.appminhaideiadb.model.Cliente;

public class ClienteController extends AppDataBase implements ICrud<Cliente> {

    ContentValues dadoDoObjeto;

    public ClienteController(Context context) {
        super(context);

        Log.d(AppUtil.TAG, "ClienteController: Conectado");
    }

    @Override
    public boolean incluir(Cliente obj) {

        dadoDoObjeto = new ContentValues();

        // dadoDoObjeto.put(ClienteDataModel.ID, obj.getId());
        // ID é chave primária da tabela cliente
        // é gerada automaticamente pelo SQLite a cada
        // novo registro adicionado
        // SQL ->>> INSERT INTO TABLE (... ... ..) VALUES (### ### ###)
        dadoDoObjeto.put(ClienteDataModel.NOME, obj.getNome());
        dadoDoObjeto.put(ClienteDataModel.EMAIL, obj.getEmail());

        // Enviar os dados (dadoDoOjeto) para a classe AppDataBase
        // utilizando o método capaz de adicionar o objeto no banco de
        // dados, tabela qualquer uma (Cliente)

        return true;

    }

    @Override
    public boolean alterar(Cliente obj) {

        dadoDoObjeto = new ContentValues();

        // ID é chave primária da tabela cliente
        // é gerada automaticamente pelo SQLite a cada
        // novo registro adicionado
        // Alterar
        // SQL ->>> UPDATE
        dadoDoObjeto.put(ClienteDataModel.ID, obj.getId());
        dadoDoObjeto.put(ClienteDataModel.NOME, obj.getNome());
        dadoDoObjeto.put(ClienteDataModel.EMAIL, obj.getEmail());

        // Enviar os dados (dadoDoOjeto) para a classe AppDataBase
        // utilizando o método capaz de alterar o objeto no banco de
        // dados, tabela qualquer uma (Cliente), respeitando o ID
        // ou PK(Primary Key)

        return true;

    }

    @Override
    public boolean deletar(Cliente obj) {

        dadoDoObjeto = new ContentValues();

        // ID é chave primária da tabela cliente
        // é gerada automaticamente pelo SQLite a cada
        // novo registro adicionado
        // Deletar
        // SQL ->>> DELETE from TABELA where ID = ???????
        dadoDoObjeto.put(ClienteDataModel.ID, obj.getId());

        // Enviar os dados (dadoDoOjeto) para a classe AppDataBase
        // utilizando o método capaz de deletar o objeto no banco de
        // dados, tabela qualquer uma (Cliente), respeitando a condição
        // condição, o resgistro tem que ser igual ao ID informado

        return true;

    }

    @Override
    public List<Cliente> listar() {

        List<Cliente> lista = new ArrayList<>();

        return lista;

    }
}
