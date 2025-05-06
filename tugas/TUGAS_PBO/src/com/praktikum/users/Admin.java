package com.praktikum.users;
import com.praktikum.actions.adminAction;
import java.util.Scanner;

public class Admin extends User implements adminAction{
    private String username;
    private String password;
    Scanner scanner = new Scanner(System.in);

    public Admin(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean login(String username, String password) {
        if (getUsername().equals(username) && getPassword().equals(password)) {
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
            System.out.println("1. kelola barang temuan ");
            System.out.println("2. kelola mahasiswa laporan");
            System.out.println("3. logout ");
            System.out.print("pilih menu: ");
            pilih = scanner.nextInt();
                switch (pilih){
                    case 1:
                        manageItems();
                        break;
                    case 2:
                        manageUsers();
                        break;
                    case 3:
                        System.out.println("Program berakhir!!");
                        break;
            }
        }while (pilih != 3);

    }

    @Override
    public void manageItems() {
        System.out.println(">>Fitur kelola barang belum tersedia<<");
    }

    @Override
    public void manageUsers() {
        System.out.println(">>Fitur kelola mahasiswa belum tersedia<<");
    }

}
