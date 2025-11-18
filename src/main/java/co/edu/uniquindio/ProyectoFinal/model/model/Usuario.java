package co.edu.uniquindio.ProyectoFinal.model.model;

import co.edu.uniquindio.ProyectoFinal.model.Patrones.Behavioral.Strategy.CalculoTarifasStrategy;
import co.edu.uniquindio.ProyectoFinal.model.Patrones.Behavioral.Strategy.TarifaEconomicaStrategy;
import co.edu.uniquindio.ProyectoFinal.model.Patrones.Behavioral.Strategy.TarifaEstandarStrategy;
import co.edu.uniquindio.ProyectoFinal.model.Patrones.Behavioral.Strategy.TarifaExpressStrategy;
import co.edu.uniquindio.ProyectoFinal.model.Patrones.Creational.GestorDatos;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String id, nombre, email, password;
    private List<Direccion> direcciones = new ArrayList<>();
    private List<Envio> envios = new ArrayList<>();

    public Usuario(String id, String nombre, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }


    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public List<Direccion> getDirecciones() { return direcciones; }
    public List<Envio> getEnvios() { return envios; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public Envio crearEnvio(Direccion origen, Direccion destino, double peso, double volumen) {
        Envio envio = new Envio();
        envio.setUsuario(this);
        envio.setOrigen(origen);
        envio.setDestino(destino);
        envio.setPeso(peso);
        envio.setVolumen(volumen);
        envio.setEstado(Envio.EstadoEnvio.SOLICITADO);

        CalculoTarifasStrategy estrategia = new TarifaEstandarStrategy();
        double costo = estrategia.calcularTarifa(origen, destino, peso);
        envio.setCosto(costo);

        GestorDatos.getInstance().getEnvios().add(envio);
        envios.add(envio);

        return envio;
    }

    public Envio crearEnvio(Direccion origen, Direccion destino, double peso, double volumen,
                            String tipoTarifa) {
        Envio envio = new Envio();
        envio.setUsuario(this);
        envio.setOrigen(origen);
        envio.setDestino(destino);
        envio.setPeso(peso);
        envio.setVolumen(volumen);
        envio.setEstado(Envio.EstadoEnvio.SOLICITADO);

        CalculoTarifasStrategy estrategia = crearEstrategiaPorTipo(tipoTarifa);
        double costo = estrategia.calcularTarifa(origen, destino, peso);
        envio.setCosto(costo);

        GestorDatos.getInstance().getEnvios().add(envio);
        envios.add(envio);

        return envio;
    }

    private CalculoTarifasStrategy crearEstrategiaPorTipo(String tipo) {
        switch (tipo.toUpperCase()) {
            case "EXPRESS":
                return new TarifaExpressStrategy();
            case "ECONOMICA":
                return new TarifaEconomicaStrategy();
            default:
                return new TarifaEstandarStrategy();
        }
    }


    public Repartidor getRepartidor(Envio envio) {
        if(envio == null || !envios.contains(envio)) {
            return null;
        }
        return envio.getRepartidor();
    }


    public List<Repartidor> getRepartidores() {
        List<Repartidor> reps = new ArrayList<>();
        for (Envio e : envios) {
            if (e.getRepartidor() != null) {
                reps.add(e.getRepartidor());
            }
        }
        return reps;
    }
    public String getIdUsuario() {
        return id;
    }
}