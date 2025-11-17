package co.edu.uniquindio.ProyectoFinal.model.Patrones.Behavioral.observer;

import co.edu.uniquindio.ProyectoFinal.model.model.Envio;

public interface EnvioObserver {
        void actualizar(Envio envio);
        String getTipoObserver();
}
