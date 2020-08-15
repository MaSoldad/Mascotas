package com.example.mascotas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.mascotas.Adaptador.Adaptador;
import com.example.mascotas.Adaptador.AdapterAnimal;
import com.example.mascotas.Entidades.Mascota;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class DogFragment extends Fragment {


    AdapterAnimal adapterAnimal;
    RecyclerView recyclerViewPerros;
    ArrayList<Mascota> listaperros;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dog, container, false);
        recyclerViewPerros = view.findViewById(R.id.recyclerdog);
        listaperros = new ArrayList<>();

        cargarLista();
        mostrar();
        return  view;

    }

    public void cargarLista(){
        listaperros.add(new Mascota(R.drawable.dog));
        listaperros.add(new Mascota(R.drawable.dog1));
        listaperros.add(new Mascota(R.drawable.dog2));
        listaperros.add(new Mascota(R.drawable.dog3));
        listaperros.add(new Mascota(R.drawable.dog4));
        listaperros.add(new Mascota(R.drawable.dog5));
        listaperros.add(new Mascota(R.drawable.dog6));
        listaperros.add(new Mascota(R.drawable.dog7));
        
    }

    public void mostrar(){
        //recyclerViewPerros.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewPerros.setLayoutManager(new GridLayoutManager(getContext(), 2));
        adapterAnimal = new AdapterAnimal(getContext(), listaperros);
        recyclerViewPerros.setAdapter(adapterAnimal);
    }

}