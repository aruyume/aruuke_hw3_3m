package com.example.aruuke_project2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class MovieViewHolder extends RecyclerView.ViewHolder {

    private TextView tvMovieName;
    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);
        tvMovieName = itemView.findViewById(R.id.tv_movie_name);
    }

    public void onBind(String movie) {
        tvMovieName.setText(movie);
    }
}
