package com.example.contatos;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class jogoViewHolder extends RecyclerView.ViewHolder {

    TextView nome, plataforma;

    public jogoViewHolder(@NonNull View itemView) {
        super(itemView);
        nome = itemView.findViewById(R.id.nome);
        plataforma = itemView.findViewById(R.id.plataforma);
    }
}
