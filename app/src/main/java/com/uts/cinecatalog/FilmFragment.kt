package com.uts.cinecatalog

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FilmFragment : Fragment(R.layout.fragment_film) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rvFilm = view.findViewById<RecyclerView>(R.id.rvFilm)

        // Setup Adapter (Hanya buat SATU variabel adapter)
        val adapter = FilmAdapter(
            listFilm = FilmData.daftarFilm,
            onItemClick = { film ->
                // Logika Intent untuk pindah ke DetailActivity
                val intent = Intent(requireContext(), DetailActivity::class.java).apply {
                    putExtra("EXTRA_JUDUL", film.judul)
                    putExtra("EXTRA_TAHUN", film.tahun)
                    putExtra("EXTRA_GENRE", film.genre)
                    putExtra("EXTRA_RATING", film.rating)
                    putExtra("EXTRA_DESKRIPSI", film.deskripsi)
                    putExtra("EXTRA_POSTER", film.posterUrl)
                    putExtra("EXTRA_TRAILER", film.trailerUrl)
                    putExtra("EXTRA_VIDEO", film.videoUrl)
                }
                startActivity(intent)
            },
            onFavoritClick = { film ->
                // Tetap pakai Toast untuk tombol favorit di list
                Toast.makeText(requireContext(), "${film.judul} ditambah ke favorit!", Toast.LENGTH_SHORT).show()
            }
        )

        // Setup RecyclerView
        rvFilm.layoutManager = LinearLayoutManager(requireContext())
        rvFilm.adapter = adapter
    }
}