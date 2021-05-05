package br.com.davi.aula.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import br.com.davi.aula.appminhaideiadb.datamodel.ProdutoDataModel;
import br.com.davi.aula.appminhaideiadb.datasource.AppDataBase;
import br.com.davi.aula.appminhaideiadb.model.Produto;

public class ProdutoController extends AppDataBase implements ICrud<Produto> {

    ContentValues dadoDoObjeto;

    public ProdutoController(Context context) {
        super(context);
    }

    @Override
    public boolean incluir(Produto obj) {

        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put(ProdutoDataModel.NOME, obj.getNome());
        dadoDoObjeto.put(ProdutoDataModel.FORNECEDOR, obj.getFornecedor());
        return false;
    }

    @Override
    public boolean alterar(Produto obj) {

        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put(ProdutoDataModel.NOME, obj.getNome());
        dadoDoObjeto.put(ProdutoDataModel.ID, obj.getID());
        dadoDoObjeto.put(ProdutoDataModel.FORNECEDOR, obj.getFornecedor());

        return false;
    }

    @Override
    public boolean deletar(Produto obj) {

        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put(ProdutoDataModel.ID, obj.getID());

        return false;
    }

    @Override
    public List<Produto> listar() {

        List<Produto> lista = new ArrayList<>();

        return lista;

    }
}
