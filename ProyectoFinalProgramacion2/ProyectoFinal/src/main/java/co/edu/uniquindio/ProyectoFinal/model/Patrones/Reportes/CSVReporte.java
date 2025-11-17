package co.edu.uniquindio.ProyectoFinal.model.Patrones.Reportes;

import co.edu.uniquindio.ProyectoFinal.model.model.Envio;

import java.util.List;

public class CSVReporte implements ReporteGenerator {

    @Override
    public void generarReporte(List<Envio> envios, String rutaArchivo) {
        String rutaCompleta = rutaArchivo + getExtension();

        System.out.println("=== REPORTE CSV SIMULADO ===");
        System.out.println("Archivo: " + rutaCompleta);
        System.out.println("ID,ESTADO,USUARIO,COSTO");

        for (Envio envio : envios) {
            System.out.println(envio.getIdEnvio() + "," +
                    envio.getEstado() + "," +
                    envio.getUsuario().getNombre() + "," +
                    envio.getCosto());
        }

        System.out.println("✅ CSV simulado generado: " + rutaCompleta);
    }

    @Override
    public String getExtension() {
        return ".csv";
    }

    @Override
    public String getDescripcionFormato() {
        return "Archivo CSV";
    }

    @Override
    public String getTipoReporte() {
        return "CSV";
    }
}