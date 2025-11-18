package co.edu.uniquindio.ProyectoFinal.controllers;

import javafx.fxml.FXML;
import co.edu.uniquindio.ProyectoFinal.utils.SceneManager;

public class MenuAdminController {

    @FXML
    public void abrirUsuarios() {
        SceneManager.cambiarEscena("fxml/RegistroUsuario.fxml");
    }

    @FXML
    public void abrirRepartidores() {
        SceneManager.cambiarEscena("fxml/RegistroRepartidor.fxml");
    }

    @FXML
    public void abrirEnvios() {
        SceneManager.cambiarEscena("fxml/CrearEnvio.fxml");
    }

    @FXML
    public void abrirMetricas() {
        SceneManager.cambiarEscena("fxml/MetricasAdmin.fxml");
    }

    @FXML
    public void cerrarSesion() {
        SceneManager.cambiarEscena("fxml/Login.fxml");
    }
}

