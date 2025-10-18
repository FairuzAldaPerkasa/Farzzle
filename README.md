<div align="center">
  <img src="https://raw.githubusercontent.com/fairuzaldaperkasa/farzzle/main/ProjekPuzzleFairuz/src/pic/main.jpg" alt="Farzzle Game" width="600"/>
  <h1><b>Farzzle - Game Puzzle Geser Klasik</b></h1>
  <p>
    <b>Sebuah game puzzle geser (sliding puzzle) yang dibangun menggunakan Java dan library Swing, menawarkan pengalaman bermain yang klasik dengan sentuhan modern.</b>
  </p>
  <p>
    <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
    <img src="https://img.shields.io/badge/Swing-blue?style=for-the-badge" alt="Java Swing">
  </p>
</div>

**Farzzle** adalah implementasi dari game puzzle geser klasik di mana pemain harus menyusun kembali potongan-potongan gambar yang telah diacak. Game ini dirancang dengan antarmuka grafis yang intuitif menggunakan Java Swing dan dilengkapi dengan berbagai fitur untuk membuat permainan lebih menarik.

---

## ✨ Fitur Utama

-   **🎨 Antarmuka Grafis yang Menarik:**
    -   **Layar Mulai (Start Screen):** Layar pembuka yang dinamis dengan animasi awan bergerak, gambar judul, dan tombol "Start" yang interaktif.
    -   **Papan Permainan:** Tampilan papan puzzle yang bersih tempat pemain berinteraksi dengan potongan gambar.
-   **🧩 Mekanisme Puzzle Geser:**
    -   Pemain dapat mengklik potongan puzzle yang berdekatan dengan ruang kosong untuk menggesernya.
    -   Potongan diacak secara otomatis setiap kali permainan baru dimulai.
-   **🖼️ Beragam Pilihan Gambar:**
    -   Pemain dapat memilih satu dari tiga gambar puzzle yang berbeda (`main.jpg`, `main2.jpg`, `main3.jpg`) sebelum memulai permainan.
-   **🏆 Deteksi Kemenangan:** Sistem secara otomatis mendeteksi ketika semua potongan puzzle telah tersusun dengan benar dan akan menampilkan pesan kemenangan.
-   **🎵 Efek Suara dan Musik:**
    -   Musik latar yang menenangkan diputar selama permainan untuk meningkatkan pengalaman bermain.
-   **🔁 Main Lagi:** Setelah menyelesaikan puzzle, pemain diberi pilihan untuk memulai permainan baru.

## 🛠️ Teknologi yang Digunakan

-   **Bahasa Pemrograman:** **Java**
-   **Library GUI:** **Java Swing** & **AWT** (untuk antarmuka grafis, event handling, dan rendering gambar).
-   **Audio:** **Java Sound API** (untuk memutar musik latar).

## 📂 Struktur Proyek

Proyek ini diorganisir ke dalam folder-folder berikut:

```

/ProjekPuzzleFairuz
├── src/
│   ├── GameStartScreen.java  \# Kelas untuk layar pembuka & pemilihan puzzle.
│   ├── Puzzle.java           \# Kelas utama yang menangani logika game puzzle.
│   └── pic/                  \# Direktori berisi semua gambar yang digunakan dalam game.
├── out/
│   └── production/           \# Direktori output hasil kompilasi (file .class).
├── Background.jpg            \# Gambar latar untuk start screen.
├── Music.wav                 \# File audio untuk musik latar.
└── ...                       \# File konfigurasi proyek lainnya.

````

## ⚙️ Prasyarat & Instalasi

Untuk dapat mengompilasi dan menjalankan proyek ini, Anda memerlukan:

-   **Java Development Kit (JDK)** versi 8 atau yang lebih baru.
-   Sebuah **IDE (Integrated Development Environment)** seperti IntelliJ IDEA, Eclipse, atau NetBeans (direkomendasikan untuk kemudahan).

### Langkah-langkah Menjalankan Proyek:

1.  **Clone atau Unduh Repository:**
    ```bash
    git clone [https://github.com/fairuzaldaperkasa/farzzle.git](https://github.com/fairuzaldaperkasa/farzzle.git)
    ```

2.  **Buka Proyek di IDE:**
    -   Buka IDE Anda (misalnya IntelliJ IDEA).
    -   Pilih "Open" atau "Import Project" dan arahkan ke folder `ProjekPuzzleFairuz` yang telah Anda unduh.
    -   IDE akan secara otomatis mendeteksi struktur proyek Java.

3.  **Pastikan Konfigurasi JDK:**
    -   Di pengaturan proyek, pastikan JDK telah dikonfigurasi dengan benar.

4.  **Jalankan Aplikasi:**
    -   Temukan file `GameStartScreen.java` di dalam direktori `src`.
    -   Klik kanan pada file tersebut dan pilih **"Run 'GameStartScreen.main()'"**.
    -   Jendela *start screen* akan muncul, dan Anda dapat memulai permainan.

## 🚀 Cara Bermain

1.  Jalankan aplikasi untuk membuka *start screen*.
2.  Pilih salah satu dari tiga gambar yang tersedia.
3.  Klik tombol **"Start"** untuk memulai permainan.
4.  Papan puzzle akan muncul dengan potongan-potongan gambar yang sudah diacak.
5.  Klik pada potongan puzzle yang berada di sebelah ruang kosong untuk memindahkannya.
6.  Terus susun potongan hingga membentuk gambar yang utuh.
7.  Setelah berhasil, sebuah pesan kemenangan akan muncul.

## 🤝 Kontribusi

Merasa tertantang untuk menambahkan fitur baru? Kontribusi Anda sangat diterima!

1.  **Fork** repository ini.
2.  Buat *branch* baru untuk fitur Anda (`git checkout -b fitur/tambah-timer`).
3.  Lakukan perubahan dan **commit** (`git commit -m 'Menambahkan timer permainan'`).
4.  **Push** ke *branch* Anda (`git push origin fitur/tambah-timer`).
5.  Buka **Pull Request**.

---
<div align="center">
  Dibuat dengan semangat oleh Fairuz Alda Perkasa
</div>
````
