package main.java.com.praktikum.gui;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import main.java.com.praktikum.main.LoginSystem;
import main.java.com.praktikum.users.User;

public class LoginPane extends VBox {
    public LoginPane(Stage stage) {
        setPadding(new Insets(10));
        setSpacing(10);

        Label title = new Label("Login Sistem Lost & Found");
        ComboBox<String> roleBox = new ComboBox<>();
        roleBox.getItems().addAll("Mahasiswa", "Admin");
        roleBox.setValue("Mahasiswa");

        TextField usernameField = new TextField();
        usernameField.setPromptText("NIM/Nama Pengguna");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        Label status = new Label();

        Button loginButton = new Button("Login");
        loginButton.setOnAction(e -> {
            String role = roleBox.getValue();
            String username = usernameField.getText();
            String password = passwordField.getText();

            User user = LoginSystem.authenticate(role, username, password);
            if (user != null) {
                if (role.equals("Mahasiswa")) {
                    new MahasiswaDashboard(stage, user);
                } else {
                    new AdminDashboard(stage, user);
                }
            } else {
                status.setText("Login gagal, periksa kredensial.");
            }
        });

        getChildren().addAll(title, roleBox, usernameField, passwordField, loginButton, status);
    }
}