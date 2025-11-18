package co.edu.uniquindio.ProyectoFinal.model.Patrones.Behavioral.Observer;

import co.edu.uniquindio.ProyectoFinal.model.Patrones.Behavioral.Command.ComandoEnvio;
import co.edu.uniquindio.ProyectoFinal.model.Patrones.Creational.GestorDatos;
import co.edu.uniquindio.ProyectoFinal.model.Dominio.Envio;

public class CrearEnvioComando implements ComandoEnvio {
    private Envio envio;
    private GestorDatos gestorDatos;
    private boolean ejecutado;

    public CrearEnvioComando(Envio envio) {
        this.envio = envio;
        this.gestorDatos = GestorDatos.getInstance();
        this.ejecutado = false;
    }

    @Override
    public void ejecutar() {
        gestorDatos.agregarEnvio(envio);
        ejecutado = true;
        System.out.println("Comando ejecutado: Envío creado - " + envio.getIdEnvio());
    }

    @Override
    public void deshacer() {
        if (ejecutado) {
            // Lógica para eliminar el envío (simplificada)
            System.out.println("Comando deshecho: Envío eliminado - " + envio.getIdEnvio());
            ejecutado = false;
        }
    }

    @Override
    public String getDescripcion() {
        return "Crear envío " + envio.getIdEnvio();
    }
}