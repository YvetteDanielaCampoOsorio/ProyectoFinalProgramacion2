package co.edu.uniquindio.ProyectoFinal.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager {

    public static Stage primaryStage;

    public static void cambiarEscena(String fxml) {
        try {
            Parent root = FXMLLoader.load(SceneManager.class.getResource("/fxml/" + fxml));
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);  // ⬅️ AQUÍ PETABA ANTES porque primaryStage era null
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error cargando archivo FXML: " + fxml);
        }
    }
}
