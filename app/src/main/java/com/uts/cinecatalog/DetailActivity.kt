package com.uts.cinecatalog

import android.net.Uri
import android.os.Bundle
import android.webkit.WebView
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Ambil data dari Intent
        val judul = intent.getStringExtra("EXTRA_JUDUL")
        val tahun = intent.getStringExtra("EXTRA_TAHUN")
        val genre = intent.getStringExtra("EXTRA_GENRE")
        val rating = intent.getStringExtra("EXTRA_RATING")
        val deskripsi = intent.getStringExtra("EXTRA_DESKRIPSI")
        val posterUrl = intent.getStringExtra("EXTRA_POSTER")
        val trailerUrl = intent.getStringExtra("EXTRA_TRAILER")
        val videoUrl = intent.getStringExtra("EXTRA_VIDEO")

        // Setup View
        val tvJudul = findViewById<TextView>(R.id.tvJudulDetail)
        val tvInfo = findViewById<TextView>(R.id.tvInfoDetail)
        val tvDeskripsi = findViewById<TextView>(R.id.tvDeskripsiDetail)
        val imgPoster = findViewById<ImageView>(R.id.imgPosterDetail)
        val btnFavorit = findViewById<ImageButton>(R.id.btnFavoritDetail)
        val webView = findViewById<WebView>(R.id.webViewTrailer)
        val videoView = findViewById<VideoView>(R.id.videoViewTrailer)

        // Tampilkan data
        tvJudul.text = judul
        tvInfo.text = "$tahun • $genre • ⭐ $rating"
        tvDeskripsi.text = deskripsi

        // Load gambar
        Glide.with(this).load(posterUrl).into(imgPoster)

        // Setup WebView
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        // Trik biar YouTube nggak nganggap ini browser nggak jelas
        webView.settings.userAgentString = "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36"
        webView.loadUrl(trailerUrl ?: "")

        // Setup VideoView
        if (!videoUrl.isNullOrEmpty()) {
            videoView.setVideoURI(Uri.parse(videoUrl))
            videoView.setOnPreparedListener { it.isLooping = true }
            videoView.start()
        }

        // Tombol favorit di halaman detail
        btnFavorit.setOnClickListener {
            Toast.makeText(this, "$judul ditambah ke favorit!", Toast.LENGTH_SHORT).show()
        }
    }
}