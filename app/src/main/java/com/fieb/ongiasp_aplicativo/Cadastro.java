package com.fieb.ongiasp_aplicativo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Cadastro extends AppCompatActivity {
    private EditText edit_text_nome;
    private EditText edit_text_email;
    private EditText edit_text_senha;
    private EditText edit_text_senha_confirm;
    private Button button_cadastrar;

    private Button button_login;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        IniciarComponentes_tree();

        // Inicialize os EditTexts e o Button
        edit_text_nome = findViewById(R.id.edit_text_nome);
        edit_text_email = findViewById(R.id.edit_text_email);
        edit_text_senha = findViewById(R.id.edit_text_senha);
        edit_text_senha_confirm = findViewById(R.id.edit_text_senha_confirm);
        button_cadastrar = findViewById(R.id.button_cadastrar);



        // Configurar o clique do botão de cadastro
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cadastro.this, Login.class);
                startActivity(intent);
            }
        });


        button_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarCadastro();
            }
        });
    }

    private void validarCadastro() {
        String nome = edit_text_nome.getText().toString().trim();
        String email = edit_text_email.getText().toString().trim();
        String senha = edit_text_senha.getText().toString().trim();
        String senhaConfirm = edit_text_senha_confirm.getText().toString().trim();

        if (TextUtils.isEmpty(nome)) {
            edit_text_nome.setError("Nome é obrigatório");
            return;
        }

        if (TextUtils.isEmpty(email) || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            edit_text_email.setError("Email inválido");
            return;
        }

        if (TextUtils.isEmpty(senha)) {
            edit_text_senha.setError("Senha é obrigatória");
            return;
        }

        if (TextUtils.isEmpty(senhaConfirm)) {
            edit_text_senha_confirm.setError("Confirme a senha");
            return;
        }

        if (!senha.equals(senhaConfirm)) {
            edit_text_senha_confirm.setError("As senhas não coincidem");
            return;
        }





        // Se todas as validações passarem, você pode prosseguir com o cadastro
        Toast.makeText(this, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show();
        // Aqui você pode adicionar a lógica para salvar os dados, por exemplo, em um banco de dados ou enviar para um servidor
    }
    private void IniciarComponentes_tree(){
        button_login = findViewById(R.id.button_login);
    }
}