package co.edu.uniquindio.ProyectoFinal.controllers;

import co.edu.uniquindio.ProyectoFinal.utils.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;

public class MetricasAdminController {

    @FXML
    private PieChart graficoEnvios;

    @FXML
    public void initialize() {
        // Datos de ejemplo mientras llega el backend
        PieChart.Data d1 = new PieChart.Data("Pendientes", 10);
        PieChart.Data d2 = new PieChart.Data("En camino", 5);
        PieChart.Data d3 = new PieChart.Data("Entregados", 20);

        graficoEnvios.getData().addAll(d1, d2, d3);
    }

    @FXML
    void handleVolver(ActionEvent event) {
        SceneManager.cambiarEscena("MenuAdmin.fxml");
    }
}
