package com.example.exament3_1.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.exament3_1.R;
import com.example.exament3_1.entities.Anime;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder>  {

//funcionalidad que recorra la lista

    List<Anime> animes;
    public int contador = 1;

    public AnimeAdapter(List<Anime> anime) {
        this.animes = anime;
    }


    @Override
    public AnimeViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        //creamos una mini vista con el item_contacto_adapter

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_anime_adapter, parent,false);


        return new AnimeViewHolder(view);

    }

    @Override
    public void onBindViewHolder( AnimeAdapter.AnimeViewHolder holder, int position) {

        View view = holder.itemView;

        Anime anime = animes.get(position);


        TextView textViewNombre = view.findViewById(R.id.tvNombre);
        TextView textViewDescripcion = view.findViewById(R.id.tvDescripcion);
        ImageView imageViewImagen = view.findViewById(R.id.imgView);
        ImageView btnFavorito = view.findViewById(R.id.imgFavorito);


        textViewNombre.setText(anime.Nombre);
        textViewDescripcion.setText(anime.Descripcion);

        //imageViewImagen.setImageResource(R.drawable.bleach);


        btnFavorito.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP && contador == 1) {
                    btnFavorito.setImageResource(R.drawable.ic_baseline_star_rate_24);
                    contador++;
                } else if (event.getAction() == MotionEvent.ACTION_UP && contador == 2) {
                    btnFavorito.setImageResource(R.drawable.ic_baseline_star_border_24);
                    contador--;
                }
                return true;
            }
        });

    }





    @Override
    public int getItemCount() {
        return animes.size();
    }


    public class AnimeViewHolder extends RecyclerView.ViewHolder{

        public AnimeViewHolder(View itemView) {
            super(itemView);
        }
    }

}
