package co.edu.uniquindio.ProyectoFinal.model.model;

public class Repartidor {

    public enum EstadoRepartidor{ACTIVO,EN_RUTA,INACTIVO}

    private String id,nombre,zona;
    private EstadoRepartidor estado=EstadoRepartidor.ACTIVO;
    public Repartidor(String id,String nombre,String zona){
        this.id = id;
        this.nombre = nombre;
        this.zona = zona;
    }
    public boolean asignarEnvio(Envio e){
        if(estado!=EstadoRepartidor.ACTIVO)return false;
        estado=EstadoRepartidor.EN_RUTA;
        e.actualizarEstado(Envio.EstadoEnvio.ASIGNADO);
        return true;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}