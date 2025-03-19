package com.game.karakter;

public class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan){
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target){
        System.out.println(this.getNama() + " menyerang " + target.getNama() + " menggunakan snake bite!!");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println("kesehatan " + target.getNama() + " tersisa " + target.getKesehatan());
    }
}
