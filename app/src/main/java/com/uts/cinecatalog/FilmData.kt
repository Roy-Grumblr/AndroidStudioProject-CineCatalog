package com.uts.cinecatalog

object FilmData {

    val filmFavorit: MutableList<Film> = mutableListOf()

    val daftarFilm: List<Film> = listOf(
        Film(
            id = 1,
            judul = "Inception",
            tahun = "2010",
            rating = "8.8",
            genre = "Sci-Fi, Thriller",
            deskripsi = "Seorang pencuri yang mencuri informasi dari mimpi orang lain mendapat tugas terakhir: menanam ide ke dalam mimpi seseorang.",
            posterUrl = "https://image.tmdb.org/t/p/w500/9gk7adHYeDvHkCSEqAvQNLV5Uge.jpg",
            trailerUrl = "https://www.youtube.com/embed/YoHD9XEInc0",
            videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
        ),
        Film(
            id = 2,
            judul = "Interstellar",
            tahun = "2014",
            rating = "8.7",
            genre = "Sci-Fi, Drama",
            deskripsi = "Sekelompok astronot melakukan perjalanan melalui lubang cacing untuk mencari rumah baru bagi umat manusia.",
            posterUrl = "https://image.tmdb.org/t/p/w500/gEU2QniE6E77NI6lCU6MxlNBvIx.jpg",
            trailerUrl = "https://www.youtube.com/embed/zSWdZVtXT7E",
            videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4"
        ),
        Film(
            id = 3,
            judul = "The Dark Knight",
            tahun = "2008",
            rating = "9.0",
            genre = "Action, Crime",
            deskripsi = "Batman menghadapi Joker, penjahat kriminal yang ingin menciptakan kekacauan di Gotham City.",
            posterUrl = "https://image.tmdb.org/t/p/w500/qJ2tW6WMUDux911r6m7haRef0WH.jpg",
            trailerUrl = "https://www.youtube.com/embed/EXeTwQWrcwY",
            videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4"
        ),
        Film(
            id = 4,
            judul = "Parasite",
            tahun = "2019",
            rating = "8.5",
            genre = "Thriller, Drama",
            deskripsi = "Sebuah keluarga miskin menyusup ke rumah keluarga kaya dengan konsekuensi yang tak terduga.",
            posterUrl = "https://image.tmdb.org/t/p/w500/7IiTTgloJzvGI1TAYymCfbfl3vT.jpg",
            trailerUrl = "https://www.youtube.com/embed/5xH0HfJHsaY",
            videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4"
        ),
        Film(
            id = 5,
            judul = "Dune",
            tahun = "2021",
            rating = "8.0",
            genre = "Sci-Fi, Adventure",
            deskripsi = "Paul Atreides harus memenuhi takdirnya di planet gurun Arrakis yang berbahaya.",
            posterUrl = "https://image.tmdb.org/t/p/w500/d5NXSklXo0qyIYkgV94XAgMIckC.jpg",
            trailerUrl = "https://www.youtube.com/embed/8g18jFHCLXk",
            videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4"
        ),
        Film(
            id = 6,
            judul = "Whiplash",
            tahun = "2014",
            rating = "8.5",
            genre = "Drama, Music",
            deskripsi = "Seorang drummer muda berlatih di bawah instruktur keras yang mendorongnya hingga batas kemampuan.",
            posterUrl = "https://image.tmdb.org/t/p/w500/7fn624j5lj3xTme2SgiLCeuedmO.jpg",
            trailerUrl = "https://www.youtube.com/embed/7d_jQycdQGo",
            videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerJoyrides.mp4"
        )
    )
}