package main.java.com.praktikum.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        LoginPane loginPane = new LoginPane(primaryStage);
        Scene scene = new Scene(loginPane, 400, 250);
        primaryStage.setTitle("Lost & Found Kampus");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
