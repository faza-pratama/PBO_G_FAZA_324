package com.game.karakter; // Mendefinisikan paket tempat kelas Musuh berada.

public class Musuh extends KarakterGame { // Kelas Musuh mewarisi (extends) kelas KarakterGame.

    // Konstruktor kelas Musuh
    public Musuh(String nama, int kesehatan){ // Konstruktor Musuh menerima nama dan kesehatan.
        super(nama, kesehatan); // Memanggil konstruktor kelas induk (KarakterGame) untuk menginisialisasi nama dan kesehatan.
    }

    // Override metode serang dari kelas KarakterGame
    @Override // Anotasi yang menandakan bahwa metode ini meng-override metode dari kelas induk.
    public void serang(KarakterGame target){ // Metode serang yang di-override, menerima target sebagai parameter.
        System.out.println(this.getNama() + " menyerang " + target.getNama() + " menggunakan snake bite!!"); // Mencetak pesan serangan dengan nama serangan spesifik.
        target.setKesehatan(target.getKesehatan() - 15); // Mengurangi kesehatan target sebesar 15 poin.
        System.out.println("kesehatan " + target.getNama() + " tersisa " + target.getKesehatan()); // Mencetak sisa kesehatan target setelah serangan.
    }
}