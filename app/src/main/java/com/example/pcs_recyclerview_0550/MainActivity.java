package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String[] movie = {"Bad Boys for Life","The Old Guard","Raised by Wolves","Elite","The Walking Dead: World Beyond","Artemis Fowl","Black Box","Riverdale","Law & Order: Special Victims Unit","Scary Movie 5","Star Trek: Discovery","Hubie Halloween","District 9","The Hurricane Heist","Paddington 2","Pride & Prejudice "};
    private String[] movieYear = {"2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016"};

    private ArrayList<Movie> listMovie;
    private RecyclerView rvMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listMovie = new ArrayList<>();
        for (int i = 0; i<movie.length ; i++){
            Movie mov = new Movie(movie[i],movieYear[i]);
            listMovie.add(mov);
        }
        rvMovie = findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);

        rvMovie.setLayoutManager(new LinearLayoutManager(this));

        MovieAdapter movieAdapter = new MovieAdapter(listMovie);
        rvMovie.setAdapter(movieAdapter);
    }
}