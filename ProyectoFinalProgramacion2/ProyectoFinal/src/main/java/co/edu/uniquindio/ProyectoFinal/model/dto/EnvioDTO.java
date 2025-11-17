package co.edu.uniquindio.ProyectoFinal.model.dto;


import co.edu.uniquindio.ProyectoFinal.model.model.Envio;

import java.util.Date;

public class EnvioDTO {
    private String idEnvio;
    private String usuarioNombre;
    private String origen;
    private String destino;
    private double peso;
    private double costo;
    private String estado;
    private Date fechaCreacion;
    private String repartidorNombre;
    private String descripcion;


    public EnvioDTO(Envio envio) {
        this.idEnvio = envio.getIdEnvio();
        this.usuarioNombre = envio.getUsuario() != null ? envio.getUsuario().getNombre() : "N/A";
        this.origen = envio.getOrigen() != null ? envio.getOrigen().getAlias() : "N/A";
        this.destino = envio.getDestino() != null ? envio.getDestino().getAlias() : "N/A";
        this.peso = envio.getPeso();
        this.costo = envio.getCosto();
        this.estado = envio.getEstado() != null ? envio.getEstado().name() : "N/A";
        this.repartidorNombre = envio.getRepartidor() != null ? envio.getRepartidor().getNombre() : "No asignado";
        this.descripcion = envio.getDescripcion() != null ? envio.getDescripcion() : "";
    }

    // Getters y Setters
    public String getIdEnvio() { return idEnvio; }
    public void setIdEnvio(String idEnvio) { this.idEnvio = idEnvio; }

    public String getUsuarioNombre() { return usuarioNombre; }
    public void setUsuarioNombre(String usuarioNombre) { this.usuarioNombre = usuarioNombre; }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public double getCosto() { return costo; }
    public void setCosto(double costo) { this.costo = costo; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Date getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(Date fechaCreacion) { this.fechaCreacion = fechaCreacion; }

    public String getRepartidorNombre() { return repartidorNombre; }
    public void setRepartidorNombre(String repartidorNombre) { this.repartidorNombre = repartidorNombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}