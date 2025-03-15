package com.game.karakter;

public class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan){
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target){
        System.out.println(this.getNama() + " menyerang " + target.getNama() + " menggunakan pedang!!");
<<<<<<< HEAD
        target.setKesehatan(target.getKesehatan() - 20);
=======
        target.setKesehatan(target.getKesehatan() - 20); //menghitung darah target
>>>>>>> c7ff730 (up to date)
        System.out.println("kesehatan " + target.getNama() + " tersisa " + target.getKesehatan());
    }
}
