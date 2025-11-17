package co.edu.uniquindio.ProyectoFinal.model.Patrones.Behavioral.observer;

import co.edu.uniquindio.ProyectoFinal.model.model.Envio;

public class AdminstradorObserver implements EnvioObserver{

        @Override
        public void actualizar(Envio envio) {
            System.out.println("🔔 Notificación ADMIN: Envío " + envio.getIdEnvio() +
                    " cambió a: " + envio.getEstado());
        }

        @Override
        public String getTipoObserver() {
            return "Administrador";
        }
}
