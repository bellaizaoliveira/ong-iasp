package com.fieb.ongiasp_aplicativo;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FormViewHolder extends RecyclerView.ViewHolder {
    EditText editTextNome;
    EditText editTextEndereco;
    EditText editTextEmail;

    EditText editTextQuarto;

    @SuppressLint("ResourceType")
    public FormViewHolder(@NonNull View itemView) {
        super(itemView);
        if (itemView.getId() == R.layout.formulario_primeiro) {
            editTextNome = itemView.findViewById(R.id.edit_text_nome);
        } else if (itemView.getId() == R.layout.formulario_segundo) {
            editTextEndereco = itemView.findViewById(R.id.edit_text_comp);
        } else if (itemView.getId() == R.layout.formulario_terceiro) {
            editTextEmail = itemView.findViewById(R.id.edit_text_email);
        }
        else if (itemView.getId() == R.layout.formulario_quarto) {
            editTextQuarto = itemView.findViewById(R.id.edit_text_NUM);
        }
    }
}
