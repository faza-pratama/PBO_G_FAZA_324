package com.game;
import com.game.karakter.KarakterGame;
import com.game.karakter.Pahlawan;
import com.game.karakter.Musuh;

public class Main {
    public static void main(String[] args){
        KarakterGame karakterGame = new KarakterGame("karakter umum", 100);

        Pahlawan brimstone = new Pahlawan("", 0);
        brimstone.setNama("Brimstone");
        brimstone.setKesehatan(150);

        Musuh viper = new Musuh("", 0);
        viper.setNama("viper");
        viper.setKesehatan(200);

        System.out.println(karakterGame.getNama() + " memiliki kesehatan: " + karakterGame.getKesehatan());
        System.out.println(brimstone.getNama() + " memiliki kesehatan: " + brimstone.getKesehatan());
        System.out.println(viper.getNama() + " memiliki kesehatan: " + viper.getKesehatan());

        brimstone.serang(viper);
        viper.serang(brimstone);
    }


}
