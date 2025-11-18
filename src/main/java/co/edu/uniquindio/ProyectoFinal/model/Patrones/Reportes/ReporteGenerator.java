package co.edu.uniquindio.ProyectoFinal.model.Patrones.Reportes;

import co.edu.uniquindio.ProyectoFinal.model.model.Envio;

import java.util.List;


public interface ReporteGenerator {

        void generarReporte(List<Envio> envios, String rutaArchivo);

        String getExtension();

        String getDescripcionFormato();

        String getTipoReporte();
}

