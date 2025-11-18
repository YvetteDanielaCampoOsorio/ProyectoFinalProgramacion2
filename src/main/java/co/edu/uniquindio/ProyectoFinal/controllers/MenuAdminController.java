package co.edu.uniquindio.ProyectoFinal.controllers;

import javafx.fxml.FXML;
import co.edu.uniquindio.ProyectoFinal.utils.SceneManager;

public class MenuAdminController {

    @FXML
    public void abrirUsuarios() {
        SceneManager.cambiarEscena("RegistroUsuario.fxml");
    }

    @FXML
    public void abrirRepartidores() {
        SceneManager.cambiarEscena("RegistroRepartidor.fxml");
    }

    @FXML
    public void abrirEnvios() {
        SceneManager.cambiarEscena("CrearEnvio.fxml");
    }

    @FXML
    public void abrirMetricas() {
        SceneManager.cambiarEscena("MetricasAdmin.fxml");
    }

    @FXML
    public void cerrarSesion() {
        SceneManager.cambiarEscena("Login.fxml");
    }
}

