package co.edu.uniquindio.ProyectoFinal.model.Patrones.Behavioral.Observer;

import co.edu.uniquindio.ProyectoFinal.model.Dominio.Envio;

public interface EnvioObserver {
    void actualizar(Envio envio);
    String getTipoObserver();
}