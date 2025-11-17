package co.edu.uniquindio.ProyectoFinal.model.model;

public class Repartidor {


    public enum EstadoRepartidor{ACTIVO,EN_RUTA,INACTIVO}
    private String id,nombre,zona;
    private EstadoRepartidor estado=EstadoRepartidor.ACTIVO;
    public Repartidor(String i,String n,String z){id=i;nombre=n;zona=z;}
    public boolean asignarEnvio(Envio e){
        if(estado!=EstadoRepartidor.ACTIVO)return false;
        estado=EstadoRepartidor.EN_RUTA;
        e.actualizarEstado(Envio.EstadoEnvio.ASIGNADO);
        return true;
    }
}
