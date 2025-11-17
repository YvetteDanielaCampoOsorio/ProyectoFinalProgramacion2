package co.edu.uniquindio.ProyectoFinal.model.Patrones.Behavioral.Strategy;

import co.edu.uniquindio.ProyectoFinal.model.model.Direccion;

public interface CalculoTarifasStrategy {
    double calcularTarifa(Direccion origen, Direccion destino, double peso);
    String getNombreEstrategia();
}