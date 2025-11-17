package co.edu.uniquindio.ProyectoFinal.model.Patrones.Reportes;

import co.edu.uniquindio.ProyectoFinal.model.model.Envio;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PDFReporte implements ReporteGenerator {

    @Override
    public void generarReporte(List<Envio> envios, String rutaArchivo) {
        String rutaCompleta = rutaArchivo + getExtension();

        System.out.println("=== REPORTE PDF SIMULADO ===");
        System.out.println("Archivo: " + rutaCompleta);
        System.out.println("Fecha: " + new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        System.out.println("Total envíos: " + envios.size());
        System.out.println("----------------------------");

        for (Envio envio : envios) {
            System.out.println("ID: " + envio.getIdEnvio() +
                    " | Estado: " + envio.getEstado() +
                    " | Costo: $" + envio.getCosto());
        }

        System.out.println("✅ PDF simulado generado: " + rutaCompleta);
    }

    @Override
    public String getExtension() {
        return ".pdf";
    }

    @Override
    public String getDescripcionFormato() {
        return "Documento PDF";
    }

    @Override
    public String getTipoReporte() {
        return "PDF";
    }
}