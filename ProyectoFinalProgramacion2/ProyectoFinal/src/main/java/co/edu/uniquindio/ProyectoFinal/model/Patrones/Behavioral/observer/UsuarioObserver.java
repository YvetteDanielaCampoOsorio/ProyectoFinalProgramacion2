package co.edu.uniquindio.ProyectoFinal.model.Patrones.Behavioral.observer;

import co.edu.uniquindio.ProyectoFinal.model.model.Envio;

public class UsuarioObserver implements EnvioObserver{
        private String nombreUsuario;

        public UsuarioObserver(String nombreUsuario) {
            this.nombreUsuario = nombreUsuario;
        }

        @Override
        public void actualizar(Envio envio) {
            System.out.println("📧 Notificación para " + nombreUsuario +
                    ": Tu envío " + envio.getIdEnvio() +
                    " está en estado: " + envio.getEstado());
        }

        @Override
        public String getTipoObserver() {
            return "Usuario";}
}
