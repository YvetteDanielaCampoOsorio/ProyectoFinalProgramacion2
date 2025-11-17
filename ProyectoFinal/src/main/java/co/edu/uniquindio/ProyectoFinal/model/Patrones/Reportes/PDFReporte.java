package co.edu.uniquindio.ProyectoFinal.model.Patrones.Reportes;


import co.edu.uniquindio.ProyectoFinal.model.Patrones.Reportes.ReporteGenerator;
import co.edu.uniquindio.ProyectoFinal.model.model.Envio;


import java.util.List;

public class PDFReporte implements ReporteGenerator {

    @Override
    public void generarReporte(List<Envio> envios, String rutaArchivo) {

        System.out.println("Simulando creación de PDF en: " + rutaArchivo);
        System.out.println("Listado de envíos incluidos en el PDF:");

        for (Envio envio : envios) {
            System.out.println("- Envío " + envio.getIdEnvio()+ " (" + envio.getOrigen() + " → " + envio.getDestino() + ")");
        }

    }

    @Override
    public String getExtension() {
        return ".pdf";
    }

    @Override
    public String getDescripcionFormato() {
        return "Reporte PDF con formato de tabla";
    }

    @Override
    public String getTipoReporte() {
        return "PDF";
    }
}
