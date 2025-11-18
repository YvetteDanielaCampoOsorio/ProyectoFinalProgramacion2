package co.edu.uniquindio.ProyectoFinal.model.dto;


public class EnvioDTO {
    private String idEnvio;
    private String nombreUsuario;
    private String direccionOrigen;
    private String direccionDestino;
    private double peso;
    private double volumen;
    private double costo;
    private String estado;
    private String fechaCreacion;
    private String fechaEntregaEstimada;

    public EnvioDTO(String idEnvio, String nombreUsuario, String direccionOrigen, String direccionDestino,
                    double peso, double volumen, double costo, String estado,
                    String fechaCreacion, String fechaEntregaEstimada) {
        this.idEnvio = idEnvio;
        this.nombreUsuario = nombreUsuario;
        this.direccionOrigen = direccionOrigen;
        this.direccionDestino = direccionDestino;
        this.peso = peso;
        this.volumen = volumen;
        this.costo = costo;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.fechaEntregaEstimada = fechaEntregaEstimada;
    }

    public String getIdEnvio() { return idEnvio; }
    public String getNombreUsuario() { return nombreUsuario; }
    public String getDireccionOrigen() { return direccionOrigen; }
    public String getDireccionDestino() { return direccionDestino; }
    public double getPeso() { return peso; }
    public double getVolumen() { return volumen; }
    public double getCosto() { return costo; }
    public String getEstado() { return estado; }
    public String getFechaCreacion() { return fechaCreacion; }
    public String getFechaEntregaEstimada() { return fechaEntregaEstimada; }
}