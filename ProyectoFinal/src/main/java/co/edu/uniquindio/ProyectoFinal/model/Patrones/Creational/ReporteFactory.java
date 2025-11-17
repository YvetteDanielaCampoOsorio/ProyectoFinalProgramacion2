package co.edu.uniquindio.ProyectoFinal.model.Patrones.Creational;

import co.edu.uniquindio.ProyectoFinal.model.Patrones.Reportes.CSVReporte;
import co.edu.uniquindio.ProyectoFinal.model.Patrones.Reportes.PDFReporte;
import co.edu.uniquindio.ProyectoFinal.model.Patrones.Reportes.ReporteGenerator;

public class ReporteFactory {

    public static ReporteGenerator crearReporte(String tipo) {

        if (tipo == null) {
            return null;
        }

        return (ReporteGenerator) switch (tipo.toUpperCase()) {
            case "CSV" -> new CSVReporte();
            case "PDF" -> new PDFReporte();
            default -> throw new IllegalArgumentException("No se encontro el tipo de reporte"+tipo);
        };
    }
}