package co.edu.uniquindio.ProyectoFinal.model.Patrones.Creational;

import co.edu.uniquindio.ProyectoFinal.model.model.Direccion;
import co.edu.uniquindio.ProyectoFinal.model.model.Envio;
import co.edu.uniquindio.ProyectoFinal.model.model.Repartidor;
import co.edu.uniquindio.ProyectoFinal.model.model.Usuario;

public class EnvioBuilder {
    private Envio envio;

    public EnvioBuilder() {
        this.envio = new Envio();
    }


    public EnvioBuilder setIdEnvio(String idEnvio) {
        envio.setIdEnvio(idEnvio);
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

    public EnvioBuilder setEstado(Envio.EstadoEnvio estado) {
        envio.setEstado(estado);
        return this;
    }

    public EnvioBuilder setUsuario(Usuario usuario) {
        envio.setUsuario(usuario);
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


    public Envio build() {
        if (envio.getOrigen() == null) {
            throw new IllegalStateException("El ORIGEN es requerido");
        }
        if (envio.getDestino() == null) {
            throw new IllegalStateException("El DESTINO es requerido");
        }
        if (envio.getPeso() <= 0) {
            throw new IllegalStateException("El PESO debe ser mayor a 0");
        }

        return envio;
    }

    public static EnvioBuilder crear() {
        return new EnvioBuilder();
    }
}