package com.uts.cinecatalog

data class Film(
    val id: Int,
    val judul: String,
    val tahun: String,
    val rating: String,
    val genre: String,
    val deskripsi: String,
    val posterUrl: String,
    val trailerUrl: String,   // link YouTube buat WebView
    val videoUrl: String      // link mp4 buat VideoView
)
