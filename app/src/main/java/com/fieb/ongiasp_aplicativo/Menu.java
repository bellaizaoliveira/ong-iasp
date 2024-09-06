package com.fieb.ongiasp_aplicativo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Menu extends AppCompatActivity {

    private RadioButton radioButton2_cadastrar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        IniciarComponentes_menu();

        radioButton2_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Cadastro.class);
                startActivity(intent);
            }
        });


    }
    private void IniciarComponentes_menu(){
        radioButton2_cadastrar = findViewById(R.id.radioButton2_cadastrar);
    }
}