package co.edu.uniquindio.ProyectoFinal.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import co.edu.uniquindio.ProyectoFinal.utils.SceneManager;

public class MisEnviosController {

    @FXML private TableView tablaEnvios;

    @FXML
    public void handleVolver() {
        SceneManager.cambiarEscena("fxml/MenuUsuario.fxml");
    }
}
