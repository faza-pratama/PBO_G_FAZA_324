package com.modul3.datauser;

public class User {
    private String nama;
    private String nim;

    public User(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public void displayinfo() {
        System.out.println("Data mahasiswa:");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }

    public boolean login(String nama, String nim) {
        if (getNama().equals(nama) && getNim().equals(nim)) {
            System.out.println("Login berhasil");
            return true;
        } else {
            System.out.println("Login gagal, nama atau nim salah coba lagi");
            return false;
        }
    }

}
