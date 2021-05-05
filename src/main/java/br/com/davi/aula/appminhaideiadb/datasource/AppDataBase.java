package br.com.davi.aula.appminhaideiadb.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import br.com.davi.aula.appminhaideiadb.api.AppUtil;
import br.com.davi.aula.appminhaideiadb.datamodel.ClienteDataModel;
import br.com.davi.aula.appminhaideiadb.datamodel.ProdutoDataModel;

public class AppDataBase extends SQLiteOpenHelper {

    public static final String DB_NAME = "AppMinhaIdeia.sqlite";
    public static final int DB_VERSION = 1;

    SQLiteDatabase db;

    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        Log.d(AppUtil.TAG, "ClienteController: Criando Banco de Dados");

        db = getWritableDatabase(); // definindo o banco de dados para escrita
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ClienteDataModel.criarTabela());

        Log.d(AppUtil.TAG, "onCreate: Tabela Cliente criada... "+ClienteDataModel.criarTabela());

        db.execSQL(ProdutoDataModel.criarTabela());

        Log.d(AppUtil.TAG, "onCreate: Tabela Produto criada... "+ProdutoDataModel.criarTabela());


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
