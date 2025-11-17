package co.edu.uniquindio.ProyectoFinal.model.Patrones.Creational;

import co.edu.uniquindio.ProyectoFinal.model.Patrones.Reportes.CSVReporte;
import co.edu.uniquindio.ProyectoFinal.model.Patrones.Reportes.PDFReporte;
import co.edu.uniquindio.ProyectoFinal.model.Patrones.Reportes.ReporteGenerator;

public class ReporteFactory {

    public ReporteGenerator crearReporte(String tipoReporte) {
        if (tipoReporte == null || tipoReporte.isEmpty()) {
            throw new IllegalArgumentException("Tipo de reporte no puede ser nulo o vacío");
        }

        switch (tipoReporte.toUpperCase()) {
            case "PDF":
                return new PDFReporte();

            case "CSV":
                return new CSVReporte();

            case "EXCEL":
                throw new UnsupportedOperationException("Reporte Excel no implementado aún");

            default:
                throw new IllegalArgumentException("Tipo de reporte no soportado: " + tipoReporte);
        }
    }

    public static ReporteGenerator crearReporteEstatico(String tipoReporte) {
        ReporteFactory factory = new ReporteFactory();
        return factory.crearReporte(tipoReporte);
    }
}
