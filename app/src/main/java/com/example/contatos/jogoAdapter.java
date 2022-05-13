package com.example.contatos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class JogoAdapter extends RecyclerView.Adapter<jogoViewHolder> {

    private Context context;
    private ArrayList<jogo> itens;

    public JogoAdapter(Context context, ArrayList<jogo> itens) {
        this.context = context;
        this.itens = itens;
    }

    @NonNull
    @Override
    public jogoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int typeView) {
        View view = LayoutInflater.from(context).inflate(R.layout.jogo_linha, parent, false);
        jogoViewHolder viewHolder = new jogoViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull jogoViewHolder holder, int position) {
        jogo jogo = itens.get(position);
        holder.nome.setText(jogo.getNome());
        holder.plataforma.setText(jogo.getPlataforma());

    }

    @Override
    public int getItemCount() {
        return itens.size();
    }
}
