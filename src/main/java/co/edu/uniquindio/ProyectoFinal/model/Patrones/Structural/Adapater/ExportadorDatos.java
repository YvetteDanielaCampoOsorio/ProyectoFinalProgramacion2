package co.edu.uniquindio.ProyectoFinal.model.Patrones.Structural.Adapater;

import co.edu.uniquindio.ProyectoFinal.model.model.Envio;

import java.util.List;

public interface ExportadorDatos {

    void exportar(List<Envio> envios, String nombreArchivo);
    String getFormato();
}
