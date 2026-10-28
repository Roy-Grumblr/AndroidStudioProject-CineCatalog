# CineCatalog

[![Build status](https://img.shields.io/badge/build-not%20configured-lightgrey)](https://github.com/)
[![Language](https://img.shields.io/badge/language-Kotlin-7F52FF)](https://kotlinlang.org/)
[![License: MIT](https://img.shields.io/badge/license-MIT-green.svg)](https://opensource.org/licenses/MIT)

## Temukan film untuk ditonton berikutnya

CineCatalog adalah aplikasi Android untuk menjelajahi pilihan film, melihat informasi dan cuplikan, serta menyimpan judul favorit selama aplikasi digunakan.

## Tentang aplikasi

CineCatalog menyajikan katalog film dalam satu tempat agar pengguna dapat melihat judul, tahun rilis, genre, rating, poster, dan ringkasan cerita tanpa harus mencari informasi tersebut satu per satu. Katalog saat ini berisi beberapa film pilihan dengan data yang disiapkan langsung di dalam aplikasi.

Ketuk film untuk membuka halaman detail, membaca sinopsis, melihat trailer YouTube, dan memutar video contoh. Pengguna juga dapat menandai film sebagai favorit dan melihat koleksinya dari tab Profil. Poster dan konten video dimuat dari tautan internet, sehingga fitur tersebut memerlukan koneksi jaringan.

Project ini masih dalam tahap **Development** dan cocok sebagai dasar pembelajaran katalog film Android. Data favorit saat ini disimpan di memori selama aplikasi berjalan; daftar tersebut belum tersimpan permanen setelah proses aplikasi ditutup.

## Fitur

- **Jelajahi katalog film** — melihat daftar pilihan film lengkap dengan poster, tahun, genre, dan rating.
- **Baca detail film** — membuka sinopsis dan informasi film pada halaman khusus.
- **Lihat trailer dan video** — menampilkan trailer melalui WebView dan memutar video melalui pemutar bawaan Android.
- **Kelola daftar favorit sementara** — menambahkan film ke favorit dan melihat poster film favorit pada tab Profil.
- **Navigasi sederhana** — berpindah antara katalog dan profil menggunakan navigasi bawah.

## Tech stack

| Komponen | Teknologi |
|---|---|
| Bahasa | Kotlin |
| Platform | Android |
| Arsitektur UI | Activity, Fragment, dan Adapter; belum menggunakan pola MVVM |
| Minimum SDK | API 24 (Android 7.0) |
| Compile SDK | API 37 |
| Target SDK | API 37 |
| Build system | Gradle 9.6.0, Android Gradle Plugin 9.4.1 |
| UI | AndroidX AppCompat, Activity KTX, Core KTX, ConstraintLayout, Material Components |
| Pemuatan gambar | Glide 4.16.0 |
| Sumber data | Daftar film statis di `FilmData`; gambar dan video memakai URL eksternal |
| Pengujian | JUnit 4 dan AndroidX Espresso |

## Screenshot

Tambahkan gambar aplikasi ke `docs/images/` untuk mengganti placeholder berikut:

![Layar katalog film](docs/images/katalog.png)

![Layar detail film](docs/images/detail-film.png)

![Layar profil dan favorit](docs/images/profil-favorit.png)

## Prasyarat

- Android Studio versi yang mendukung **Android Gradle Plugin 9.4.1**.
- Android SDK Platform 37 dan Android SDK Build-Tools yang sesuai, dipasang melalui SDK Manager.
- JDK 25 untuk menjalankan Gradle daemon sesuai konfigurasi project. Kode aplikasi dikompilasi dengan kompatibilitas Java 11.
- Perangkat Android atau emulator dengan API 24 atau lebih baru.
- Koneksi internet untuk sinkronisasi Gradle dan memuat poster, trailer, serta video.

## Instalasi dan menjalankan

1. Clone repository:

   ```bash
   git clone https://github.com/<USERNAME>/CineCatalog.git
   cd CineCatalog
   ```

   Ganti `<USERNAME>` dengan pemilik repository yang sesuai.

2. Buka Android Studio, pilih **Open**, lalu pilih folder `CineCatalog`.
3. Tunggu proses **Gradle Sync** selesai. Jika diminta, pasang SDK Platform 37 melalui SDK Manager dan pilih JDK 25 untuk Gradle.
4. Pilih konfigurasi **app** dan perangkat/emulator Android API 24 atau lebih baru, lalu tekan **Run**.

Untuk membuat APK debug dari Windows PowerShell, jalankan:

```powershell
.\gradlew.bat :app:assembleDebug
```

APK hasil build tersedia di `app/build/outputs/apk/debug/app-debug.apk`.

## Struktur project

```text
CineCatalog/
├── app/
│   ├── build.gradle.kts
│   └── src/
│       ├── androidTest/                 # Pengujian instrumentasi
│       ├── main/
│       │   ├── java/com/uts/cinecatalog/
│       │   │   ├── MainActivity.kt      # Activity utama dan navigasi
│       │   │   ├── FilmFragment.kt       # Daftar katalog film
│       │   │   ├── DetailActivity.kt     # Detail, trailer, dan pemutar video
│       │   │   ├── ProfilFragment.kt     # Profil dan tampilan daftar favorit
│       │   │   ├── Film.kt               # Model data film
│       │   │   ├── FilmData.kt           # Data katalog dan favorit
│       │   │   ├── FilmAdapter.kt        # Adapter katalog
│       │   │   └── FavoritAdapter.kt     # Adapter poster favorit
│       │   └── res/                      # Layout, menu, tema, dan aset
│       └── test/                         # Pengujian unit
├── gradle/
│   └── libs.versions.toml                # Versi plugin dan dependensi
├── build.gradle.kts
├── settings.gradle.kts
└── gradlew.bat
```

## Kontribusi

Kontribusi, perbaikan bug, dan ide fitur dipersilakan:

1. Fork repository dan buat branch baru, misalnya `feature/pencarian-film`.
2. Buat perubahan yang terfokus dan ikuti pola kode yang sudah digunakan.
3. Jalankan build serta pengujian yang relevan.
4. Kirim Pull Request dengan ringkasan perubahan dan langkah untuk mengujinya.

Untuk perubahan besar, diskusikan terlebih dahulu melalui issue agar arah implementasi dapat disepakati.

## Lisensi

Project ini menggunakan lisensi [MIT](https://opensource.org/licenses/MIT).
