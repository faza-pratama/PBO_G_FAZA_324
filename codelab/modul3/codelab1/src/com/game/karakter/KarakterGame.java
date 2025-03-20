package com.game.karakter; // Mendefinisikan paket tempat kelas ini berada.

public class KarakterGame { // Mendefinisikan kelas KarakterGame, yang merupakan kelas dasar untuk semua karakter dalam game.

    // Atribut (fields) kelas KarakterGame
    private String nama; // Atribut untuk menyimpan nama karakter (private, hanya dapat diakses di dalam kelas ini).
    private int kesehatan; // Atribut untuk menyimpan jumlah kesehatan karakter (private).

    // Konstruktor kelas KarakterGame
    public KarakterGame(String nama, int kesehatan){ // Konstruktor untuk membuat objek KarakterGame baru.
        this.nama = nama; // Mengatur nilai atribut nama dengan nilai yang diberikan saat pembuatan objek.
        this.kesehatan = kesehatan; // Mengatur nilai atribut kesehatan dengan nilai yang diberikan.
    }

    // Metode getter untuk mendapatkan nilai atribut nama
    public String getNama(){ // Metode untuk mendapatkan nama karakter.
        return nama; // Mengembalikan nilai atribut nama.
    }

    // Metode setter untuk mengatur nilai atribut nama
    public void setNama(String nama) { // Metode untuk mengatur nama karakter.
        this.nama = nama; // Mengatur nilai atribut nama dengan nilai yang diberikan.
    }

    // Metode getter untuk mendapatkan nilai atribut kesehatan
    public int getKesehatan() { // Metode untuk mendapatkan jumlah kesehatan karakter.
        return kesehatan; // Mengembalikan nilai atribut kesehatan.
    }

    // Metode setter untuk mengatur nilai atribut kesehatan
    public void setKesehatan(int kesehatan) { // Metode untuk mengatur jumlah kesehatan karakter.
        this.kesehatan = kesehatan; // Mengatur nilai atribut kesehatan dengan nilai yang diberikan.
    }

    // Metode serang untuk mensimulasikan serangan karakter ke karakter lain
    public void serang(KarakterGame target){ // Metode untuk mensimulasikan serangan ke karakter target.
        System.out.println(this.nama + " menyerang " + target.getNama()); // Mencetak pesan serangan ke konsol.
        // Di sini, Anda dapat menambahkan logika untuk mengurangi kesehatan target.
        // Misalnya: target.setKesehatan(target.getKesehatan() - 10);
    }
}