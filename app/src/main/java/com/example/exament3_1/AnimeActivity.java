package com.example.exament3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.exament3_1.adapters.AnimeAdapter;
import com.example.exament3_1.entities.Anime;

import java.util.ArrayList;
import java.util.List;

public class AnimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime);

        //vinculas con el activity _mylist
        RecyclerView rv = findViewById(R.id.rvAnime);

        rv.setLayoutManager(new LinearLayoutManager( AnimeActivity.this )); // esto es obligatorio por defecto

        List<Anime> animes = GetAnimes();

        AnimeAdapter animeAdapter = new AnimeAdapter(animes);

        rv.setAdapter(animeAdapter);



    }


    //Crear anime
    private List<Anime> GetAnimes(){

        List<Anime> animes = new ArrayList<>();

        animes.add(new Anime("Naruto","Descripcion Naruto"));
        animes.add(new Anime("Belach","Descripcion Bleach"));
        animes.add(new Anime("Gungrave","Descripcion Gungrave"));
        animes.add(new Anime("Devil may cry","Devil may cry"));
        animes.add(new Anime("Super Campeones","Descripcion Super Campeones"));
        animes.add(new Anime("Dragon Ball","Descripcion Dragon Ball"));
        animes.add(new Anime("Samurai X","Descripcion Samurai X"));
        animes.add(new Anime("Pokemon","Descripcion Pokemon"));
        animes.add(new Anime("Caballeros del Zodiaco","Caballeros del Zodiaco"));
        animes.add(new Anime("Kenichi","Kenichi"));


        return animes;
    }


}