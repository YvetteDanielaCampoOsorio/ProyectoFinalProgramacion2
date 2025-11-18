package co.edu.uniquindio.ProyectoFinal.model.dto;


import java.time.LocalDate;

public class PagoDTO {
    private String idPago;
    private double monto;
    private LocalDate fecha;
    private String metodo;
    private String estado;

    public PagoDTO(String idPago, double monto, LocalDate fecha, String metodo, String estado) {
        this.idPago = idPago;
        this.monto = monto;
        this.fecha = fecha;
        this.metodo = metodo;
        this.estado = estado;
    }

    public String getIdPago() { return idPago; }
    public double getMonto() { return monto; }
    public LocalDate getFecha() { return fecha; }
    public String getMetodo() { return metodo; }
    public String getEstado() { return estado; }
}