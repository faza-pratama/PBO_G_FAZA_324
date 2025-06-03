import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.Random;

public class TebakAngka extends Application {
    private int angkaRahasia;
    private int jumlahPercobaan;
    private TextField inputField;
    private Label pesanLabel;
    private Label percobaanLabel;
    private Button tebakButton;

    @Override
    public void start(Stage primaryStage) {
        angkaRahasia = generateAngkaRahasia();
        jumlahPercobaan = 0;

        inputField = new TextField();
        inputField.setPromptText("Masukkan angka");

        pesanLabel = new Label();
        percobaanLabel = new Label("Jumlah percobaan: 0");

        tebakButton = new Button("Coba Tebak");
        tebakButton.setOnAction(e -> prosesTebakan());

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(pesanLabel, inputField, tebakButton, percobaanLabel);

        Scene scene = new Scene(layout, 300, 150);
        primaryStage.setTitle("Tebak Angka");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private int generateAngkaRahasia() {
        Random random = new Random();
        return random.nextInt(100);
    }

    private void prosesTebakan() {
        String inputText = inputField.getText();
        try {
            int tebakan = Integer.parseInt(inputText);
            jumlahPercobaan++;
            if (tebakan < angkaRahasia) {
                pesanLabel.setText("Terlalu kecil!");
            } else if (tebakan > angkaRahasia) {
                pesanLabel.setText("Terlalu besar!");
            } else {
                pesanLabel.setText("Tebakan benar!");
                tebakButton.setText("Main Lagi");
                tebakButton.setOnAction(e -> resetGame());
            }
            percobaanLabel.setText("Jumlah percobaan: " + jumlahPercobaan);
            inputField.clear();
        } catch (NumberFormatException e) {
            pesanLabel.setText("Masukkan angka yang valid!");
        }
    }

    private void resetGame() {
        angkaRahasia = generateAngkaRahasia();
        jumlahPercobaan = 0;
        inputField.clear();
        pesanLabel.setText("");
        percobaanLabel.setText("Jumlah percobaan: 0");
        tebakButton.setText("Coba Tebak");
        tebakButton.setOnAction(e -> prosesTebakan());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
