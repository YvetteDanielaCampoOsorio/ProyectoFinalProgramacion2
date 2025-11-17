package co.edu.uniquindio.ProyectoFinal.model.Patrones.Structural;

import co.edu.uniquindio.ProyectoFinal.model.Patrones.Creational.GestorDatos;
import co.edu.uniquindio.ProyectoFinal.model.model.Direccion;
import co.edu.uniquindio.ProyectoFinal.model.model.Envio;
import co.edu.uniquindio.ProyectoFinal.model.model.Repartidor;
import co.edu.uniquindio.ProyectoFinal.model.model.Usuario;

public class SistemaEnviosFacade {
        private GestorDatos gestorDatos;

        public SistemaEnviosFacade() {
            this.gestorDatos = GestorDatos.getInstance();
        }

        public Envio crearEnvio(Usuario usuario, Direccion origen, Direccion destino, double peso) {
            Envio envio = new Envio();
            envio.setUsuario(usuario);
            envio.setOrigen(origen);
            envio.setDestino(destino);
            envio.setPeso(peso);
            envio.setEstado(Envio.EstadoEnvio.SOLICITADO);

            gestorDatos.agregarEnvio(envio);
            return envio;
        }

        public boolean asignarRepartidor(Long envioId, Long repartidorId) {
            Envio envio = gestorDatos.buscarEnvioPorId(envioId);
            Repartidor repartidor = gestorDatos.buscarRepartidorPorId(repartidorId);

            if (envio != null && repartidor != null) {
                envio.setRepartidor(repartidor);
                envio.setEstado(Envio.EstadoEnvio.ASIGNADO);
                return true;
            }
            return false;
        }

    public String obtenerEstadisticas() {
            return null;
    }
}

