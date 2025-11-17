package co.edu.uniquindio.ProyectoFinal.model.Patrones.Creational;

import co.edu.uniquindio.ProyectoFinal.model.model.*;

import java.util.ArrayList;
import java.util.List;

public class GestorDatos {
    private static GestorDatos instance;

    private List<Usuario> usuarios;
    private List<Repartidor> repartidores;
    private List<Envio> envios;
    private List<Pago> pagos;
    private List<Direccion> direcciones;


    private GestorDatos() {
        inicializarListas();
    }


    private void inicializarListas() {
        this.usuarios = new ArrayList<>();
        this.repartidores = new ArrayList<>();
        this.envios = new ArrayList<>();
        this.pagos = new ArrayList<>();
        this.direcciones = new ArrayList<>();
    }

    public static GestorDatos getInstance() {
        if (instance == null) {
            instance = new GestorDatos();
        }
        return instance;
    }


    public void agregarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void agregarRepartidor(Repartidor repartidor) {
        this.repartidores.add(repartidor);
    }

    public void agregarEnvio(Envio envio) {
        this.envios.add(envio);
    }

    public void agregarPago(Pago pago) {
        this.pagos.add(pago);
    }



    public void agregarDireccion(Direccion direccion) {
        this.direcciones.add(direccion);
    }

    public Envio buscarEnvioPorId(String id) {
        for (Envio envio : envios) {
            if (envio.getIdEnvio().equals(id)) {
                return envio;
            }
        }
        return null;
    }

    public Usuario buscarUsuarioPorId(String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    public Repartidor buscarRepartidorPorId(String id) {
        for (Repartidor repartidor : repartidores) {
            if (repartidor.getId().equals(id)) {
                return repartidor;
            }
        }
        return null;
    }


    public List<Usuario> getUsuarios() {
        return new ArrayList<>(usuarios);
    }

    public List<Repartidor> getRepartidores() {
        return new ArrayList<>(repartidores);
    }

    public List<Envio> getEnvios() {
        return new ArrayList<>(envios);
    }

    public List<Pago> getPagos() {
        return new ArrayList<>(pagos);
    }


    public List<Direccion> getDirecciones() {
        return new ArrayList<>(direcciones);
    }

    public void actualizarEstadoEnvio(String envioId, Envio.EstadoEnvio nuevoEstado) {
        Envio envio = buscarEnvioPorId(envioId);
        if (envio != null) {
            envio.setEstado(nuevoEstado);
        }
    }
}