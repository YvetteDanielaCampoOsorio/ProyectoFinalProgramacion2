package co.edu.uniquindio.ProyectoFinal.model.Patrones.Behavioral.command;

import co.edu.uniquindio.ProyectoFinal.model.Patrones.Creational.GestorDatos;
import co.edu.uniquindio.ProyectoFinal.model.model.Envio;

public class ActualizarEstadoComando implements ComandoEnvio {
        private Long envioId;
        private Envio.EstadoEnvio nuevoEstado;
        private Envio.EstadoEnvio estadoAnterior;
        private GestorDatos gestorDatos;

        public ActualizarEstadoComando(Long envioId, Envio.EstadoEnvio nuevoEstado) {
            this.envioId = envioId;
            this.nuevoEstado = nuevoEstado;
            this.gestorDatos = GestorDatos.getInstance();
        }

        @Override
        public void ejecutar() {
            Envio envio = gestorDatos.buscarEnvioPorId(envioId);
            if (envio != null) {
                estadoAnterior = envio.getEstado();
                envio.setEstado(nuevoEstado);
                System.out.println("Estado actualizado: " + envioId + " -> " + nuevoEstado);
            }
        }

        @Override
        public void deshacer() {
            if (estadoAnterior != null) {
                Envio envio = gestorDatos.buscarEnvioPorId(envioId);
                if (envio != null) {
                    envio.setEstado(estadoAnterior);
                    System.out.println("↩️ Estado revertido: " + envioId + " -> " + estadoAnterior);
                }
            }
        }

        @Override
        public String getDescripcion() {
            return "Actualizar estado envío " + envioId + " a " + nuevoEstado;
        }
}
