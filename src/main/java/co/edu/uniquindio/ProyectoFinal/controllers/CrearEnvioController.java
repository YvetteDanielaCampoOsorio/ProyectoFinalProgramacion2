package co.edu.uniquindio.ProyectoFinal.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import co.edu.uniquindio.ProyectoFinal.utils.SceneManager;

public class CrearEnvioController {

    @FXML private TextField txtOrigen;
    @FXML private TextField txtDestino;
    @FXML private TextField txtPeso;
    @FXML private ComboBox<String> comboTipo;
    @FXML private ComboBox<String> comboPago;
    @FXML private Label labelTarifa;

    @FXML
    public void handleCalcularTarifa() {
        // Por ahora solo muestra un valor de ejemplo
        labelTarifa.setText("Tarifa: $5000");
    }

    @FXML
    public void handleCrearEnvio() {
        System.out.println("Envío creado (simulado)");
    }

    @FXML
    public void handleVolver() {
        SceneManager.cambiarEscena("MenuUsuario.fxml");
    }
}
