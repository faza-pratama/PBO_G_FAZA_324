package main.java.com.praktikum.gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import main.java.com.praktikum.data.DataStore;
import main.java.com.praktikum.users.User;

public class MahasiswaDashboard {
    public MahasiswaDashboard(Stage stage, User user) {
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));

        Label welcome = new Label("Selamat datang, " + user.getName());

        TextField namaField = new TextField();
        namaField.setPromptText("Nama Barang");
        TextField lokasiField = new TextField();
        lokasiField.setPromptText("Lokasi Ditemukan/Hilang");

        Button laporButton = new Button("Laporkan");

        TableView<DataStore.Item> table = new TableView<>();
        ObservableList<DataStore.Item> data = FXCollections.observableArrayList(DataStore.getItemList());
        table.setItems(data);

        TableColumn<DataStore.Item, String> namaCol = new TableColumn<>("Nama");
        namaCol.setCellValueFactory(c -> new javafx.beans.property.SimpleStringProperty(c.getValue().getNama()));
        TableColumn<DataStore.Item, String> lokasiCol = new TableColumn<>("Lokasi");
        lokasiCol.setCellValueFactory(c -> new javafx.beans.property.SimpleStringProperty(c.getValue().getLokasi()));
        table.getColumns().addAll(namaCol, lokasiCol);

        laporButton.setOnAction(e -> {
            String nama = namaField.getText();
            String lokasi = lokasiField.getText();
            if (!nama.isEmpty() && !lokasi.isEmpty()) {
                DataStore.Item item = new DataStore.Item(nama, lokasi, "Reported");
                DataStore.addItem(item);
                data.setAll(DataStore.getItemList());
                namaField.clear();
                lokasiField.clear();
            }
        });

        Button logout = new Button("Logout");
        logout.setOnAction(e -> {
            LoginPane loginPane = new LoginPane(stage);
            Scene loginScene = new Scene(loginPane, 400, 250);
            stage.setScene(loginScene);
        });

        layout.getChildren().addAll(welcome, namaField, lokasiField, laporButton, table, logout);
        Scene scene = new Scene(layout, 600, 400);
        stage.setScene(scene);
    }
}