package co.edu.uniquindio.ProyectoFinal.controllers;

import javafx.fxml.FXML;
import co.edu.uniquindio.ProyectoFinal.utils.SceneManager;

import java.io.IOException;

public class MenuUsuarioController {

    @FXML
    public void abrirCrearEnvio() throws IOException {
        SceneManager.cambiarEscena("fxml/CrearEnvio.fxml");
    }

    @FXML
    public void abrirHistorial() throws IOException {
        SceneManager.cambiarEscena("fxml/MisEnvios.fxml");
    }

    @FXML
    public void abrirReportes() {
        SceneManager.cambiarEscena("fxml/Reportes.fxml");
    }

    @FXML
    public void cerrarSesion() {
        SceneManager.cambiarEscena("fxml/Login.fxml");
    }
}
