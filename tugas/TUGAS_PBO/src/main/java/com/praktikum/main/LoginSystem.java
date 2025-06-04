package main.java.com.praktikum.main;

import main.java.com.praktikum.data.DataStore;
import main.java.com.praktikum.users.*;

public class LoginSystem {
    public static User authenticate(String role, String username, String password) {
        if (role.equals("Mahasiswa")) {
            if (username.equals("faza") && password.equals("324")) {
                return new Mahasiswa("faza", "202410370110324");
            }
        } else if (role.equals("Admin")) {
            if (username.equals("admin") && password.equals("admin")) {
                return new Admin("admin");
            }
        }
        return null;
    }
}
