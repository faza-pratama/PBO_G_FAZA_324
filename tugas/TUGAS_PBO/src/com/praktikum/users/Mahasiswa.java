package com.praktikum.users;
import com.praktikum.actions.mahasiswaAction;
import java.util.Scanner;

public class Mahasiswa extends User implements mahasiswaAction{
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
    Scanner scanner = new Scanner(System.in);

    @Override
    public boolean login(String nama, String nim) {
        if (getNama().equals(nama) && getNim().equals(nim)) {
            System.out.println("Login berhasil");
            return true;
        } else {
            System.out.println("Login gagal, nama atau nim salah coba lagi");
            return false;
        }
    }

    @Override
    public void diplayMenu() {
        int pilih = 0;
       do {
            System.out.println("1. laporan barang temuan ");
            System.out.println("2. lihat daftar laporan");
            System.out.println("3. logout ");
            System.out.print("pilih menu: ");
            pilih = scanner.nextInt();

            switch (pilih){
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 3:
                    System.out.println("Program berakhir!!");
                    break;
            }
       }while (pilih != 3);
    }

    @Override
    public void reportItem() {
        System.out.print("Nama barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Deskripsi barang: ");
        String deskripsiBarang = scanner.nextLine();
        System.out.print("Lokasi terakhir: ");
        String lokasiTerakhir = scanner.nextLine();
        System.out.println("Barang sudah di konfirmasi");
    }

    @Override
    public void viewReportedItems() {
        System.out.println(">>Fitur lihat laporan belum tersedia<<");
    }

}
