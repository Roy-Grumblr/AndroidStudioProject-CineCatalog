package com.uts.cinecatalog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class FavoritAdapter(
    private val listFilm: List<Film>
) : RecyclerView.Adapter<FavoritAdapter.FavoritViewHolder>() {

    class FavoritViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgPosterFavorit: ImageView = view.findViewById(R.id.imgPosterFavorit)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoritViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_film_favorit, parent, false)
        return FavoritViewHolder(view)
    }

    override fun onBindViewHolder(holder: FavoritViewHolder, position: Int) {
        val film = listFilm[position]
        Glide.with(holder.itemView.context)
            .load(film.posterUrl)
            .placeholder(R.color.surface_dark)
            .into(holder.imgPosterFavorit)
    }

    override fun getItemCount(): Int = listFilm.size
}
