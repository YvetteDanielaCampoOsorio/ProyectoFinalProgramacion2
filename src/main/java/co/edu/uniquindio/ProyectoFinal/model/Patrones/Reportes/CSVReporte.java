package co.edu.uniquindio.ProyectoFinal.model.Patrones.Reportes;

import co.edu.uniquindio.ProyectoFinal.model.Dominio.Envio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;



    public class CSVReporte implements ReporteGenerator {

        @Override
        public void generarReporte(List<Envio> envios, String rutaArchivo) {
            try (FileWriter writer = new FileWriter(rutaArchivo + getExtension())) {

                writer.write("ID,Fecha,Estado,Peso,Volumen,Costo,Origen,Destino\n");

                for (Envio envio : envios) {
                    writer.write(envio.getIdEnvio() + "," +
                            envio.getFecha() + "," +
                            envio.getEstado() + "," +
                            envio.getPeso() + "," +
                            envio.getVolumen() + "," +
                            envio.getCosto() + "," +
                            envio.getOrigen().getAlias() + " - " + envio.getOrigen().getCalle() + "," +
                            envio.getOrigen().getCiudad() + " - " + envio.getDestino().getAlias() +
                            envio.getDestino().getCalle() + "," + envio.getDestino().getCiudad() + "," +
                            "\n");
                }

                System.out.println("Reporte CSV generado correctamente.");

            } catch (IOException e) {
                System.out.println("Error generando CSV: " + e.getMessage());
            }
        }

        @Override
        public String getExtension() {
            return ".csv";
        }

        @Override
        public String getDescripcionFormato() {
            return "Reporte en formato CSV";
        }

        @Override
        public String getTipoReporte() {
            return "CSV";
        }
    }

