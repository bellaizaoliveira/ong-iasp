package com.fieb.ongiasp_aplicativo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.sql.Connection;

public class Testebanco extends AppCompatActivity {

    TextView BancoTeste;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testebanco);


        Connection conn = conexao.conectar(Testebanco.this);
        BancoTeste = findViewById(R.id.BancoTeste);

        try{
            if (conn != null){
                if(!conn.isClosed())
                    BancoTeste.setText("CONEXAO REALIZAA COM SUCESSO");
                else
                    BancoTeste.setText("CONEXAO FECHADA");
            }else{
                BancoTeste.setText("CONEXAO NULA, NAO RELIAZIDA");
            }
        }catch (java.sql.SQLException ex){
            ex.printStackTrace();
            BancoTeste.setText("CONEXAO FALHOU\n"+ ex.getMessage());
        }
    }
}