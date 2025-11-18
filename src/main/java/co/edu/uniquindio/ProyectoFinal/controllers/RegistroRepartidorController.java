package co.edu.uniquindio.ProyectoFinal.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import co.edu.uniquindio.ProyectoFinal.utils.SceneManager;

public class RegistroRepartidorController {

    @FXML private TextField txtNombre;
    @FXML private TextField txtCorreo;
    @FXML private TextField txtTelefono;

    @FXML
    public void handleRegistrar() {
        System.out.println("Repartidor registrado (simulado)");
    }

    @FXML
    public void handleVolver() {
        SceneManager.cambiarEscena("fxml/MenuAdmin.fxml");
    }
}
