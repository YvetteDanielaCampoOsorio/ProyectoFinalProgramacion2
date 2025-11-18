package co.edu.uniquindio.ProyectoFinal.model.Patrones.Creational;

import co.edu.uniquindio.ProyectoFinal.model.Dominio.Direccion;
import co.edu.uniquindio.ProyectoFinal.model.Dominio.Envio;
import co.edu.uniquindio.ProyectoFinal.model.Dominio.Repartidor;
import co.edu.uniquindio.ProyectoFinal.model.Dominio.Usuario;

import java.time.LocalDate;

public class EnvioBuilder {

    private Envio envio;

    public EnvioBuilder() {
        this.envio = new Envio();
        envio.setEstado(Envio.EstadoEnvio.SOLICITADO);
    }
    public static EnvioBuilder crear() {
        return new EnvioBuilder();
    }
    public EnvioBuilder setUsuario(Usuario usuario) {
        envio.setUsuario(usuario);
        return this;
    }

    public EnvioBuilder setOrigen(Direccion origen) {
        envio.setOrigen(origen);
        return this;
    }

    public EnvioBuilder setDestino(Direccion destino) {
        envio.setDestino(destino);
        return this;
    }

    public EnvioBuilder setPeso(double peso) {
        envio.setPeso(peso);
        return this;
    }

    public EnvioBuilder setVolumen(double volumen) {
        envio.setVolumen(volumen);
        return this;
    }

    public EnvioBuilder setCosto(double costo) {
        envio.setCosto(costo);
        return this;
    }

    public EnvioBuilder setRepartidor(Repartidor repartidor) {
        envio.setRepartidor(repartidor);
        return this;
    }

    public EnvioBuilder setDescripcion(String descripcion) {
        envio.setDescripcion(descripcion);
        return this;
    }
    private EnvioBuilder setFecha(LocalDate fecha) {
        envio.setFecha(fecha);
        return this;
    }



    public Envio build() {
        if (envio.getUsuario() == null) {
            throw new IllegalStateException("El Usuario es requerido");
        }
        if (envio.getOrigen() == null) {
            throw new IllegalStateException("El origen es requerido");
        }
        if (envio.getDestino() == null) {
            throw new IllegalStateException("El Destino es requerido");
        }
        if (envio.getPeso() <= 0) {
            throw new IllegalStateException("El peso debe ser mayor  0");
        }

        return envio;
    }


}