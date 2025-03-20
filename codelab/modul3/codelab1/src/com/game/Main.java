package com.game; // Mendefinisikan paket tempat kelas-kelas ini berada, yaitu com.game.

import com.game.karakter.KarakterGame; // Mengimpor kelas KarakterGame dari paket com.game.karakter.
import com.game.karakter.Pahlawan; // Mengimpor kelas Pahlawan dari paket com.game.karakter.
import com.game.karakter.Musuh; // Mengimpor kelas Musuh dari paket com.game.karakter.

public class Main { // Mendefinisikan kelas utama, Main.
    public static void main(String[] args){ // Metode utama, titik awal eksekusi program.
        KarakterGame karakterGame = new KarakterGame("karakter umum", 100); // Membuat objek karakterGame dari kelas KarakterGame, dengan nama "karakter umum" dan kesehatan 100.

        Pahlawan brimstone = new Pahlawan("", 0); // Membuat objek brimstone dari kelas Pahlawan, dengan nama "" dan kesehatan 0.
        brimstone.setNama("Brimstone"); // Mengatur nama menjadi "Brimstone".
        brimstone.setKesehatan(150); // Mengatur kesehatan brimstone menjadi 150.

        Musuh viper = new Musuh("", 0); // Membuat objek viper dari kelas Musuh, dengan nama "" dan kesehatan 0.
        viper.setNama("viper"); // Mengatur nama menjadi "viper".
        viper.setKesehatan(200); // Mengatur kesehatan viper menjadi 200.

        System.out.println(karakterGame.getNama() + " memiliki kesehatan: " + karakterGame.getKesehatan()); // Mencetak nama dan kesehatan karakterGame ke konsol.
        System.out.println(brimstone.getNama() + " memiliki kesehatan: " + brimstone.getKesehatan()); // Mencetak nama dan kesehatan brimstone ke konsol.
        System.out.println(viper.getNama() + " memiliki kesehatan: " + viper.getKesehatan()); // Mencetak nama dan kesehatan viper ke konsol.

        brimstone.serang(viper); // Memanggil metode serang() pada objek brimstone, dengan objek viper sebagai argumen.
        viper.serang(brimstone); // Memanggil metode serang() pada objek viper, dengan objek brimstone sebagai argumen.
    }
}