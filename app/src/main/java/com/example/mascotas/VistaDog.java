package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import com.example.mascotas.Adaptador.Adaptador;
import com.example.mascotas.Entidades.Mascota;

import java.util.ArrayList;

public class VistaDog extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adaptador adaptador;
    private RecyclerView.LayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_dog);

        recyclerView = (RecyclerView) findViewById(R.id.listamascota);
        //manager = new LinearLayoutManager(this);
        manager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(manager);


        adaptador = new Adaptador(this, GetArrayList());
        recyclerView.setAdapter(adaptador);
    }

    private ArrayList<Mascota> GetArrayList(){
        ArrayList<Mascota> listItem = new ArrayList<>();
        listItem.add(new Mascota(R.drawable.dog));
        listItem.add(new Mascota(R.drawable.dog1));
        listItem.add(new Mascota(R.drawable.dog2));
        listItem.add(new Mascota(R.drawable.dog3));
        listItem.add(new Mascota(R.drawable.dog4));
        listItem.add(new Mascota(R.drawable.dog5));
        listItem.add(new Mascota(R.drawable.dog6));
        listItem.add(new Mascota(R.drawable.dog7));

        return listItem;
    }
}