package co.edu.uniquindio.ProyectoFinal.model.Patrones.Structural.Decorator;

public class EnvioBase implements ServicioEnvio {

    private double costoBase;

    public EnvioBase(double costoBase) {
        this.costoBase = costoBase;
    }

    @Override
    public String getDescripcion() {
        return "Envío estándar";
    }

    @Override
    public double calcularCosto() {
        return costoBase;
    }

    @Override
    public String getDetallesServicio() {
        return "Servicio de envío estándar dentro de la ciudad";
    }
}