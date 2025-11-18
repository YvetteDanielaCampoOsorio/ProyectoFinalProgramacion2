package co.edu.uniquindio.ProyectoFinal.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import co.edu.uniquindio.ProyectoFinal.utils.SceneManager;

public class ReportesController {

    @FXML private ComboBox<String> comboTipoReporte;

    @FXML
    public void handleGenerarPDF() {
        System.out.println("PDF generado (simulado)");
    }

    @FXML
    public void handleGenerarCSV() {
        System.out.println("CSV generado (simulado)");
    }

    @FXML
    public void handleVolver() {
        SceneManager.cambiarEscena("MenuUsuario.fxml");
    }
}
