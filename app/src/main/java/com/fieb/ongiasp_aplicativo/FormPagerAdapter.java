package com.fieb.ongiasp_aplicativo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FormPagerAdapter extends RecyclerView.Adapter<FormViewHolder> {

    @NonNull
    @Override
    public FormViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case 0:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.formulario_primeiro, parent, false);
                break;
            case 1:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.formulario_segundo, parent, false);
                break;
            case 2:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.formulario_terceiro, parent, false);
                break;
            case 3:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.formulario_quarto, parent, false);
                break;
            default:
                throw new IllegalStateException("Unexpected position: " + viewType);
        }
        return new FormViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FormViewHolder holder, int position) {
        // Você pode adicionar lógica específica aqui, se necessário
    }

    @Override
    public int getItemCount() {
        return 4 ; // Número total de formulários
    }

    @Override
    public int getItemViewType(int position) {
        return position; // Retorna a posição
    }
}
