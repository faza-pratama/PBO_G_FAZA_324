package com.modul3;

import com.modul3.datauser.User;
import com.modul3.datauser.Admin;
import com.modul3.datauser.Mahasiswa;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner objInput = new Scanner(System.in);

        User user = new User("user", "0000");

        Admin admin = new Admin("namaAdmin", "NIMadmin", "UserAdmin", "passAdmin");
        admin.setNama("Alinno faza");
        admin.setNim("324");
        admin.setAdminuser("admin324");
        admin.setPassword("pass324");

        Mahasiswa mahasiswa = new Mahasiswa("nama", "324");
        mahasiswa.setNama("Alinno faza");
        mahasiswa.setNim("324");

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
                    String adminUser = objInput.nextLine();
                    System.out.print("Masukan Password:");
                    String password = objInput.nextLine();
                    if (admin.login(adminUser, password)) {
                        admin.displayinfo();
                    }
                    break;

                case 2:
                    System.out.print("Masukan nama:");
                    String nama = objInput.nextLine();
                    System.out.print("Masukan nim:");
                    String nim = objInput.nextLine();
                    if (mahasiswa.login(nama, nim)) {
                        mahasiswa.displayinfo();
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