package co.edu.uniquindio.ProyectoFinal.controllers;

import co.edu.uniquindio.ProyectoFinal.utils.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    public void handleLogin(ActionEvent event) {
        try {
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            SceneManager.cambiarEscena("MenuUsuario.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void handleRegistrar(ActionEvent event) {
        try {
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            SceneManager.cambiarEscena("RegistroUsuario.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
