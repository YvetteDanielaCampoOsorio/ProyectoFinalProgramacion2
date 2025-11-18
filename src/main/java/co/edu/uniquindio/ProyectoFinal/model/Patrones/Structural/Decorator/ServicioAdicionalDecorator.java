package co.edu.uniquindio.ProyectoFinal.model.Patrones.Structural.Decorator;

public class ServicioAdicionalDecorator implements ServicioEnvio {

    protected ServicioEnvio servicioDecorado;

    public ServicioAdicionalDecorator(ServicioEnvio servicioDecorado) {
        this.servicioDecorado = servicioDecorado;
    }

    @Override
    public String getDescripcion() {
        return servicioDecorado.getDescripcion();
    }

    @Override
    public double calcularCosto() {
        return servicioDecorado.calcularCosto();
    }

    @Override
    public String getDetallesServicio() {
        return servicioDecorado.getDetallesServicio();
    }
}