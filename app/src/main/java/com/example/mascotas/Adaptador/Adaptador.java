package com.example.mascotas.Adaptador;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mascotas.Entidades.Mascota;
import com.example.mascotas.R;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter {

    private Context context;
    private ArrayList<Mascota> lisItems;

    public Adaptador(Context context, ArrayList<Mascota> lisItems) {
        this.context = context;
        this.lisItems = lisItems;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View contentView = LayoutInflater.from(context).inflate(R.layout.galerio, null);
        return new Holder(contentView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
       Mascota mascota = lisItems.get(position);
       Holder Holder = (Holder) holder;
       Holder.ivfoto.setImageResource(mascota.getImagen());
    }

    @Override
    public int getItemCount() {
        return lisItems.size();
    }

    public static class Holder extends RecyclerView.ViewHolder{

        ImageView ivfoto;

        public Holder (View iteView){
            super(iteView);
            ivfoto = iteView.findViewById(R.id.imageView);
        }
    }

    /*
    public Adaptador(Context context, ArrayList<Mascota> lisItems) {
        this.context = context;
        this.lisItems = lisItems;
    }

    @Override
    public int getCount() {
        return lisItems.size();
    }

    @Override
    public Object getItem(int i) {
        return lisItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Mascota item = (Mascota) getItem(i);

        view = LayoutInflater.from(context).inflate(R.layout.lista, null);
        ImageView imgFoto = (ImageView) view.findViewById(R.id.imageView);

        imgFoto.setImageResource(item.getImagen());
        return view;
    }

     */


}
