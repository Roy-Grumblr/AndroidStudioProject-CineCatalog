package com.uts.cinecatalog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class FilmAdapter(
    private val listFilm: List<Film>,
    private val onItemClick: (Film) -> Unit,
    private val onFavoritClick: (Film) -> Unit
) : RecyclerView.Adapter<FilmAdapter.FilmViewHolder>() {

    class FilmViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgPoster: ImageView = view.findViewById(R.id.imgPoster)
        val tvJudul: TextView = view.findViewById(R.id.tvJudul)
        val tvInfo: TextView = view.findViewById(R.id.tvInfo)
        val tvRating: TextView = view.findViewById(R.id.tvRating)
        val btnFavorit: ImageButton = view.findViewById(R.id.btnFavorit)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_film, parent, false)
        return FilmViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val film = listFilm[position]

        holder.tvJudul.text = film.judul
        holder.tvInfo.text = "${film.tahun} • ${film.genre}"
        holder.tvRating.text = "⭐ ${film.rating}"

        // Load gambar pakai Glide
        Glide.with(holder.itemView.context)
            .load(film.posterUrl)
            .placeholder(R.color.surface_dark)
            .into(holder.imgPoster)

        // Klik item buat pindah ke Detail
        holder.itemView.setOnClickListener { onItemClick(film) }

        // Klik tombol Favorit (bintang)
        holder.btnFavorit.setOnClickListener {
            if (!FilmData.filmFavorit.contains(film)) {
                FilmData.filmFavorit.add(film)
                Toast.makeText(
                    holder.itemView.context,
                    "${film.judul} masuk favorit!",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    holder.itemView.context,
                    "Film sudah ada di favorit",
                    Toast.LENGTH_SHORT
                ).show()
            }
            onFavoritClick(film)
        }
    }

    override fun getItemCount(): Int = listFilm.size
}