package co.edu.uniquindio.ProyectoFinal.model.model;

import java.time.LocalDate;

public class Envio {

    public enum EstadoEnvio {
        SOLICITADO, ASIGNADO, EN_RUTA, ENTREGADO, CANCELADO
    }

    private static int contador = 1;
    private String idEnvio;
    private Direccion origen, destino;
    private double peso, volumen, costo;
    private EstadoEnvio estado;
    private Usuario usuario;
    private Repartidor repartidor;
    private String descripcion;
    private LocalDate fecha;

    public Envio(Direccion o, Direccion d, double p, double v) {
        this.idEnvio = "E" + contador++;
        this.origen = o;
        this.destino = d;
        this.peso = p;
        this.volumen = v;
        this.estado = EstadoEnvio.SOLICITADO;// Estado inicial
        this.fecha =  LocalDate.now();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Envio() {
        this.idEnvio = "E" + contador++;
        this.estado = EstadoEnvio.SOLICITADO;
    }


    public String getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(String idEnvio) {
        this.idEnvio = idEnvio;
    }

    public EstadoEnvio getEstado() {
        return estado;
    }

    public void setEstado(EstadoEnvio estado) {
        this.estado = estado;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Direccion getOrigen() {
        return origen;
    }

    public void setOrigen(Direccion origen) {
        this.origen = origen;
    }

    public Direccion getDestino() {
        return destino;
    }

    public void setDestino(Direccion destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void actualizarEstado(EstadoEnvio e) {
        estado = e;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
