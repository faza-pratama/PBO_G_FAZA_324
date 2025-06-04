package main.java.com.praktikum.users;

import javafx.application.Application;
import javafx.stage.Stage;
import main.java.com.praktikum.gui.AdminDashboard;
import main.java.com.praktikum.gui.MahasiswaDashboard;

public class test extends Application {

    @Override
    public void start(Stage primaryStage) {
        User adminUser = new Admin("Admin Satu");
        User mahasiswaUser = new Mahasiswa("Budi", "123456");

        boolean isTestingAdmin = true;

        if (isTestingAdmin) {
            new AdminDashboard(primaryStage, adminUser);
        } else {
            new MahasiswaDashboard(primaryStage, mahasiswaUser);
        }

        primaryStage.setTitle("Test Dashboard");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
