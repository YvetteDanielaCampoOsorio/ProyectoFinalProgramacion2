package co.edu.uniquindio.ProyectoFinal.model.Patrones.Behavioral.Command;


import co.edu.uniquindio.ProyectoFinal.model.model.Envio;

public class ActualizarEstadoComando implements ComandoEnvio {

        private Envio envio;
        private Envio.EstadoEnvio nuevoEstado;
        private Envio.EstadoEnvio estadoAnterior;

        public ActualizarEstadoComando(Envio envio, Envio.EstadoEnvio nuevoEstado) {
            this.envio = envio;
            this.nuevoEstado = nuevoEstado;
            this.estadoAnterior = envio.getEstado(); // Guardamos el estado actual
        }

        @Override
        public void ejecutar() {
            envio.setEstado(nuevoEstado);
        }

        @Override
        public void deshacer() {
            envio.setEstado(estadoAnterior);
        }

        @Override
        public String getDescripcion() {
            return "Actualizar estado del envío " + envio.getIdEnvio() +
                    " de " + estadoAnterior + " a " + nuevoEstado;
        }
    }

