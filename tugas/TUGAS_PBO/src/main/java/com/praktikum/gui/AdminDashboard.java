package main.java.com.praktikum.gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import main.java.com.praktikum.data.DataStore;
import main.java.com.praktikum.data.Item;
import main.java.com.praktikum.users.Mahasiswa;
import main.java.com.praktikum.users.User;

public class AdminDashboard {
    private ObservableList<Item> itemData;
    private ObservableList<Mahasiswa> mahasiswaData;

    public AdminDashboard(Stage stage, User user) {
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));

        Label title = new Label("Halo, Administrator " + user.getName());

        itemData = FXCollections.observableArrayList(Item.getItemList());
        TableView<Item> table = new TableView<>();
        table.setItems(itemData);

        TableColumn<Item, String> namaCol = new TableColumn<>("Nama");
        namaCol.setCellValueFactory(c -> new javafx.beans.property.SimpleStringProperty(c.getValue().getNama()));
        TableColumn<Item, String> lokasiCol = new TableColumn<>("Lokasi");
        lokasiCol.setCellValueFactory(c -> new javafx.beans.property.SimpleStringProperty(c.getValue().getLokasi()));
        TableColumn<Item, String> statusCol = new TableColumn<>("Status");
        statusCol.setCellValueFactory(c -> new javafx.beans.property.SimpleStringProperty(c.getValue().getStatus()));
        table.getColumns().addAll(namaCol, lokasiCol, statusCol);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        Button tandaiClaimed = new Button("Tandai Claimed");
        tandaiClaimed.setOnAction(e -> {
            Item selected = table.getSelectionModel().getSelectedItem();
            if (selected != null) {
                Item.updateItemStatus(selected, "Claimed");

                itemData.setAll(Item.getItemList());

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Success");
                alert.setHeaderText(null);
                alert.setContentText("Status item berhasil diubah menjadi 'Claimed'");
                alert.showAndWait();
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText(null);
                alert.setContentText("Silakan pilih item yang ingin ditandai sebagai 'Claimed'");
                alert.showAndWait();
            }
        });

        mahasiswaData = FXCollections.observableArrayList(DataStore.getMahasiswaList());
        TableView<Mahasiswa> mahasiswaTable = new TableView<>();
        mahasiswaTable.setItems(mahasiswaData);

        TableColumn<Mahasiswa, String> namaMahasiswaCol = new TableColumn<>("Nama");
        namaMahasiswaCol.setCellValueFactory(c -> new javafx.beans.property.SimpleStringProperty(c.getValue().getName()));
        TableColumn<Mahasiswa, String> nimCol = new TableColumn<>("NIM");
        nimCol.setCellValueFactory(c -> new javafx.beans.property.SimpleStringProperty(c.getValue().getNim()));
        mahasiswaTable.getColumns().addAll(namaMahasiswaCol, nimCol);
        mahasiswaTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        TextField namaField = new TextField();
        namaField.setPromptText("Nama Mahasiswa");
        TextField nimField = new TextField();
        nimField.setPromptText("NIM");

        Button tambahMahasiswa = new Button("Tambah Mahasiswa");
        tambahMahasiswa.setOnAction(e -> {
            String nama = namaField.getText().trim();
            String nim = nimField.getText().trim();

            if (!nama.isEmpty() && !nim.isEmpty()) {
                boolean nimExists = DataStore.getMahasiswaList().stream()
                        .anyMatch(m -> m.getNim().equals(nim));

                if (nimExists) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText(null);
                    alert.setContentText("NIM sudah terdaftar!");
                    alert.showAndWait();
                    return;
                }

                DataStore.addMahasiswa(new Mahasiswa(nama, nim));

                mahasiswaData.setAll(DataStore.getMahasiswaList());

                namaField.clear();
                nimField.clear();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Success");
                alert.setHeaderText(null);
                alert.setContentText("Mahasiswa berhasil ditambahkan!");
                alert.showAndWait();
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText(null);
                alert.setContentText("Nama dan NIM tidak boleh kosong!");
                alert.showAndWait();
            }
        });

        Button hapusMahasiswa = new Button("Hapus Mahasiswa");
        hapusMahasiswa.setOnAction(e -> {
            Mahasiswa selected = mahasiswaTable.getSelectionModel().getSelectedItem();
            if (selected != null) {
                Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
                confirmAlert.setTitle("Konfirmasi Hapus");
                confirmAlert.setHeaderText(null);
                confirmAlert.setContentText("Apakah Anda yakin ingin menghapus mahasiswa: " +
                        selected.getName() + " (" + selected.getNim() + ")?");

                if (confirmAlert.showAndWait().get() == ButtonType.OK) {
                    DataStore.removeMahasiswa(selected);

                    mahasiswaData.setAll(DataStore.getMahasiswaList());

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Success");
                    alert.setHeaderText(null);
                    alert.setContentText("Mahasiswa berhasil dihapus!");
                    alert.showAndWait();
                }
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText(null);
                alert.setContentText("Silakan pilih mahasiswa yang ingin dihapus!");
                alert.showAndWait();
            }
        });

        HBox formMahasiswa = new HBox(5, namaField, nimField, tambahMahasiswa, hapusMahasiswa);
        formMahasiswa.setPadding(new Insets(10, 0, 0, 0));

        Button logout = new Button("Logout");
        logout.setOnAction(e -> {
            LoginPane loginPane = new LoginPane(stage);
            Scene loginScene = new Scene(loginPane, 400, 250);
            stage.setScene(loginScene);
        });

        layout.getChildren().addAll(
                title,
                new Label("Laporan Barang"),
                table,
                tandaiClaimed,
                new Label("Data Mahasiswa"),
                mahasiswaTable,
                formMahasiswa,
                logout
        );

        Scene scene = new Scene(layout, 800, 600);
        stage.setScene(scene);
    }
}