package com.praktikum.main;

import com.praktikum.users.User;
import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        User user1 = new Admin("faza", "324");
        User user2 = new Mahasiswa("faza", "324");
        Scanner objInput = new Scanner(System.in);

        int pilihan = 0;

        while (pilihan != 3) {
            System.out.println("Pilih Login:");
            System.out.println("1. Login Admin");
            System.out.println("2. Login Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Masukan pilihan: ");
            pilihan = objInput.nextInt();
            objInput.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukan Username:");
                    String username = objInput.nextLine();
                    System.out.print("Masukan Password:");
                    String password = objInput.nextLine();
                    if (user1.login(username, password)) {
                        user1.diplayMenu();
                    }else {
                        System.out.println("login gagal");
                    }
                    break;


                case 2:
                    System.out.print("Masukan nama:");
                    String nama = objInput.nextLine();
                    System.out.print("Masukan nim:");
                    String nim = objInput.nextLine();
                    if (user2.login(nama, nim)) {
                        user2.diplayMenu();
                    }else {
                        System.out.println("login gagal");
                    }
                    break;

                case 3:
                    System.out.println("Program berakhir.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
        objInput.close();
    }

}