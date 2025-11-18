package co.edu.uniquindio.ProyectoFinal.model.Patrones.Structural.Decorator;

import co.edu.uniquindio.ProyectoFinal.model.Dominio.Envio;

public class EnvioBase implements ServicioEnvio {

    private Envio envio;

    public EnvioBase(Envio envio) {
        this.envio = envio;
    }

    @Override
    public String getDescripcion() {
        return "Envío estándar";
    }

    @Override
    public double calcularCosto() {
        return envio.getCosto();
    }

    @Override
    public String getDetallesServicio() {
        return "Envío estándar:\n" +
                "- Origen: " + envio.getOrigen().getAlias() + "\n" +
                "- Destino: " + envio.getDestino().getAlias() + "\n" +
                "- Peso: " + envio.getPeso() + "kg\n" +
                "- Fecha: " + envio.getFecha();
    }
}