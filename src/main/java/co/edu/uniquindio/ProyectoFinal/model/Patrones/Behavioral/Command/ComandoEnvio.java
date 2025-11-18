package co.edu.uniquindio.ProyectoFinal.model.Patrones.Behavioral.Command;

public interface ComandoEnvio {
    void ejecutar();
    void deshacer();
    String getDescripcion();
}
