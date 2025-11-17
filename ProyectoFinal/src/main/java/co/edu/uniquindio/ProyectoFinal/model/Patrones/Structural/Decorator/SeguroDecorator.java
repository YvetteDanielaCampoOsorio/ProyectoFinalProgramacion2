package co.edu.uniquindio.ProyectoFinal.model.Patrones.Structural.Decorator;

public class SeguroDecorator extends ServicioAdicionalDecorator{

    private double costoSeguro;
    private double valorAsegurado;

    public SeguroDecorator(ServicioEnvio servicioDecorado, double costoSeguro, double valorAsegurado) {
        super(servicioDecorado);
        this.costoSeguro = costoSeguro;
        this.valorAsegurado = valorAsegurado;
    }

    @Override
    public String getDescripcion() {
        return servicioDecorado.getDescripcion() + " + Seguro";
    }

    @Override
    public double calcularCosto() {
        return servicioDecorado.calcularCosto() + costoSeguro;
    }

    @Override
    public String getDetallesServicio() {
        return servicioDecorado.getDetallesServicio() +
                "\n- Seguro incluido: $" + valorAsegurado + " valor asegurado";
    }

    public double getValorAsegurado() {
        return valorAsegurado;
    }

}