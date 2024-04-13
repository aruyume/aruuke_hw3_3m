package com.example.aruuke_project2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    private ArrayList<String> movieList = new ArrayList<>();
    private RecyclerView rvMovie;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvMovie = requireActivity().findViewById(R.id.rv_movie);
        loadData();
        MovieAdapter movieAdapter = new MovieAdapter(movieList);
        rvMovie.setAdapter(movieAdapter);
    }

    private void loadData() {
        movieList.add("The Sky Is Everywhere");
        movieList.add("The Gentlemen");
        movieList.add("Dune");
        movieList.add("Venom");
        movieList.add("Marvel");
        movieList.add("The Event Horizon");
        movieList.add("Tenet");
        movieList.add("It Chapter Two");
        movieList.add("Star Trek");
        movieList.add("No Time To Die");
        movieList.add("La La Land");
        movieList.add("Zootopia");
        movieList.add("Frozen");
        movieList.add("Harry Potter");
        movieList.add("13th");
        movieList.add("Free Solo");
    }
}