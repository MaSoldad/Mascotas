package com.example.mascotas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mascotas.Adaptador.AdapterGato;
import com.example.mascotas.Entidades.Mascota;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class caballoFragment extends Fragment {

    AdapterGato adaptergato;
    RecyclerView recyclerViewGatos;
    ArrayList<Mascota> listagatos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_caballo, container, false);

        recyclerViewGatos = view.findViewById(R.id.recyclecaballo);
        listagatos = new ArrayList<>();

        cargarLista();
        mostrar();
        return  view;
    }

    public void cargarLista(){
        listagatos.add(new Mascota(R.drawable.caballo1));
        listagatos.add(new Mascota(R.drawable.hor2));
        listagatos.add(new Mascota(R.drawable.hor3));
        listagatos.add(new Mascota(R.drawable.hor4));
        listagatos.add(new Mascota(R.drawable.caballo1));
        listagatos.add(new Mascota(R.drawable.hor2));
        listagatos.add(new Mascota(R.drawable.hor3));
        listagatos.add(new Mascota(R.drawable.hor4));

    }

    public void mostrar(){
        //recyclerViewGatos.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewGatos.setLayoutManager(new GridLayoutManager(getContext(), 2));
        adaptergato = new AdapterGato(getContext(), listagatos);
        recyclerViewGatos.setAdapter(adaptergato);
    }
}