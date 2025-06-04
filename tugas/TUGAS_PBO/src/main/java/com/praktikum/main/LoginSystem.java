package main.java.com.praktikum.main;

import main.java.com.praktikum.data.DataStore;
import main.java.com.praktikum.users.*;

public class LoginSystem {
    public static User authenticate(String role, String username, String password) {
        if (role.equals("Mahasiswa")) {
            for (Mahasiswa mhs : DataStore.getMahasiswaList()) {
                if (mhs.getName().equalsIgnoreCase(username) && mhs.getNim().equals(password)) {
                    return new Mahasiswa("faza", "202410370110324");
                }
                }
        } else if (role.equals("Admin")) {
            if (username.equals("admin") && password.equals("admin")) {
                return new Admin("admin");
            }
        }
        return null;
    }
}
