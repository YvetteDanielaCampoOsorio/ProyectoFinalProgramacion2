package co.edu.uniquindio.ProyectoFinal.controllers;

import co.edu.uniquindio.ProyectoFinal.utils.SceneManager;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class RegistroUsuarioController {

    @FXML private TextField txtNombre;
    @FXML private TextField txtCorreo;
    @FXML private TextField txtTelefono;
    @FXML private PasswordField txtPassword;

    public void handleCrearCuenta() {
        System.out.println("Cuenta creada (simulación)");
        SceneManager.cambiarEscena("Login.fxml");
    }

    public void handleVolver() {
        SceneManager.cambiarEscena("Login.fxml");
    }
}
