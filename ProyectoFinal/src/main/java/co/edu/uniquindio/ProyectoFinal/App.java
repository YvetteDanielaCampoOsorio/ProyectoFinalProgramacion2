package co.edu.uniquindio.ProyectoFinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import co.edu.uniquindio.ProyectoFinal.utils.SceneManager;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        SceneManager.primaryStage = stage; // ⬅️ GUARDAR EL STAGE AQUÍ

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Login.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Plataforma de Logística");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
