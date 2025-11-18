package co.edu.uniquindio.ProyectoFinal.model.model;
public class Pago {
    public enum EstadoPago{PENDIENTE,APROBADO,RECHAZADO}
    private Envio envio;private double monto;private EstadoPago estado=EstadoPago.PENDIENTE;
    public Pago(Envio e,double m){envio=e;monto=m;}
    public boolean procesar(){estado=monto>0?EstadoPago.APROBADO:EstadoPago.RECHAZADO;return estado==EstadoPago.APROBADO;}
    public Envio getEnvio() { return envio; }
    public double getMonto() { return monto; }
    public EstadoPago getEstado() { return estado; }
}
