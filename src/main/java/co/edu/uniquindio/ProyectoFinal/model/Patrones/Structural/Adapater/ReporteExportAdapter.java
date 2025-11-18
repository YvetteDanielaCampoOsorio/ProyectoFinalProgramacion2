package co.edu.uniquindio.ProyectoFinal.model.Patrones.Structural.Adapater;

import co.edu.uniquindio.ProyectoFinal.model.Patrones.Reportes.ReporteGenerator;
import co.edu.uniquindio.ProyectoFinal.model.model.Envio;

import java.util.List;

public class ReporteExportAdapter implements ExportadorDatos {
    private ReporteGenerator reporte;

    public ReporteExportAdapter(ReporteGenerator reporte) {
        this.reporte = reporte;
    }

    @Override
    public void exportar(List<Envio> envios, String nombreArchivo) {
        reporte.generarReporte(envios, nombreArchivo);
    }

    @Override
    public String getFormato() {
        return reporte.getTipoReporte();
    }
}