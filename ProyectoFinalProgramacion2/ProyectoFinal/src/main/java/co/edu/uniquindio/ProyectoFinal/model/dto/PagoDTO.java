package co.edu.uniquindio.ProyectoFinal.model.dto;


import co.edu.uniquindio.ProyectoFinal.model.model.Pago;

public class PagoDTO {
    private String envioId;
    private double monto;
    private String estado;
    private boolean aprobado;

    public PagoDTO(Pago pago) {
        this.envioId = pago.getEnvio() != null ? pago.getEnvio().getIdEnvio() : "N/A";
        this.monto = pago.getMonto();
        this.estado = pago.getEstado() != null ? pago.getEstado().name() : "PENDIENTE";
        this.aprobado = pago.getEstado() == Pago.EstadoPago.APROBADO;
    }

    public String getEnvioId() { return envioId; }
    public void setEnvioId(String envioId) { this.envioId = envioId; }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public boolean isAprobado() { return aprobado; }
    public void setAprobado(boolean aprobado) { this.aprobado = aprobado; }

    @Override
    public String toString() {
        return String.format("PagoDTO{envio='%s', monto=%.2f, estado='%s', aprobado=%s}",
                envioId, monto, estado, aprobado);
    }
}
