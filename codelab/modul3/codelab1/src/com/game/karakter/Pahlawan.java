package com.game.karakter; // Mendefinisikan paket tempat kelas Pahlawan berada.

public class Pahlawan extends KarakterGame { // Kelas Pahlawan mewarisi (extends) kelas KarakterGame.

    // Konstruktor kelas Pahlawan
    public Pahlawan (String nama, int kesehatan){ // Konstruktor Pahlawan menerima nama dan kesehatan.
        super(nama, kesehatan); // Memanggil konstruktor kelas induk (KarakterGame) untuk menginisialisasi nama dan kesehatan.
    }

    // Override metode serang dari kelas KarakterGame
    @Override // Anotasi yang menandakan bahwa metode ini meng-override metode dari kelas induk.
    public void serang(KarakterGame target){ // Metode serang yang di-override, menerima target sebagai parameter.
        System.out.println(this.getNama() + " menyerang " + target.getNama() + " menggunakan orbital strike!!"); // Mencetak pesan serangan dengan nama serangan spesifik.
        target.setKesehatan(target.getKesehatan() - 20); // Mengurangi kesehatan target sebesar 20 poin.
        System.out.println("kesehatan " + target.getNama() + " tersisa " + target.getKesehatan()); // Mencetak sisa kesehatan target setelah serangan.
    }
}