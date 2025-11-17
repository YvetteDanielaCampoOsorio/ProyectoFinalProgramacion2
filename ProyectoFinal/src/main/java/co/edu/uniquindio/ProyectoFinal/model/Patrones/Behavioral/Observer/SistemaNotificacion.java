package co.edu.uniquindio.ProyectoFinal.model.Patrones.Behavioral.Observer;

import co.edu.uniquindio.ProyectoFinal.model.model.Envio;

import java.util.ArrayList;
import java.util.List;

public class SistemaNotificacion {
    private List<EnvioObserver> observadores;

    public SistemaNotificacion() {
        this.observadores = new ArrayList<>();
    }

    public void agregarObserver(EnvioObserver observer) {
        observadores.add(observer);
    }

    public void removerObserver(EnvioObserver observer) {
        observadores.remove(observer);
    }

    public void notificarTodos(Envio envio) {
        for (EnvioObserver observer : observadores) {
            observer.actualizar(envio);
        }
    }
}