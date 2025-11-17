package co.edu.uniquindio.ProyectoFinal.model.Patrones.Behavioral.command;

public interface ComandoEnvio {
        void ejecutar();
        void deshacer();
        String getDescripcion();
}

