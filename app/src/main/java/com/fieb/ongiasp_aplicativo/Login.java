package com.fieb.ongiasp_aplicativo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.fieb.ongiasp_aplicativo.Login;
import com.fieb.ongiasp_aplicativo.R;

public class Login extends AppCompatActivity {



    private TextView text_tela_cadastro;
private Button button_two;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        IniciarComponentes();
IniciarComponenetes_two();

button_two.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Login.this,MainActivity.class);
        startActivity(intent);
    }
});


text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Login.this, Cadastro.class);
        startActivity(intent);
    }
});


    }
private void IniciarComponenetes_two(){
        button_two = findViewById(R.id.button_two);
}
        private void IniciarComponentes(){
            text_tela_cadastro = findViewById(R.id.text_tela_cadastro);
        }






}