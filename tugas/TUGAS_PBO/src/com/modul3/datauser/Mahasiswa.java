package com.modul3.datauser;

public class Mahasiswa extends User{
    public Mahasiswa(String nama, String nim){
        super(nama, nim);
    }

    public void displayinfo(){
        System.out.println("Data Mahasiswa:");
        System.out.println("Nama:" + getNama());
        System.out.println("NIM:" + getNim());
    }

    public boolean login(String nama, String nim){
        if(getNama().equalsIgnoreCase(nama) && getNim().equalsIgnoreCase(nim)){
            System.out.println("login berhasil");
            displayinfo();
            return true;
        } else {
            System.out.println("login gagal, nama atau nim salah coba lagi");
            return false;
        }
    }
}
