package br.com.davi.aula.appminhaideiadb.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import br.com.davi.aula.appminhaideiadb.R;
import br.com.davi.aula.appminhaideiadb.api.AppUtil;
import br.com.davi.aula.appminhaideiadb.controller.ClienteController;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "onCreate: App Minha Ideia DataBase");


        clienteController = new ClienteController(getApplicationContext());
    }
}