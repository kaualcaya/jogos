 package com.example.contatos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

 public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private JogoAdapter adapter;
    private ArrayList<jogo> itens;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler = findViewById(R.id.simples_lista);
        itens = new ArrayList<jogo>();
        itens.add(new jogo ( "halo", "Xbox"));
        itens.add(new jogo ( "Warzone",  "Xbox"));
        itens.add(new jogo ( "GTA 5",  "Xbox"));
        adapter = new JogoAdapter( this, itens);
        LinearLayoutManager layoutMananger = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL, false);
        recycler.setLayoutManager(layoutMananger);
        recycler. setAdapter(adapter);
    }
}