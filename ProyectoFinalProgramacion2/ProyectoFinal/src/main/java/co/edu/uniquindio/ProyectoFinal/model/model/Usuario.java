package co.edu.uniquindio.ProyectoFinal.model.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String id,nombre,email,password;
    private List<Direccion> direcciones=new ArrayList<>();
    private List<Envio> envios=new ArrayList<>();
    public Usuario(String id,String nombre,String email,String password){
        this.id=id;this.nombre=nombre;this.email=email;this.password=password;
    }

    public static Object getRepartidor() {
        return new Object();
    }

    public Envio crearEnvio(Direccion o,Direccion d,double p,double v){
        Envio e=new Envio();
        e.setEstado(Envio.EstadoEnvio.SOLICITADO);
        Database.getInstance().getEnvios().add(e);
        envios.add(e);
        return e;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getIdUsuario() {
        return id;
    }

    public static class

    Tarifa {
        public double calcularCosto(Envio e){
            return 5000 + e.getPeso()*1000 + e.getVolumen()*2000;
        }
    }
}

