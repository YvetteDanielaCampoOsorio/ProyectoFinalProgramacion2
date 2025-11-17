package co.edu.uniquindio.ProyectoFinal.model.Patrones.Behavioral.Strategy;

import co.edu.uniquindio.ProyectoFinal.model.model.Direccion;

public class TarifaExpressStrategy implements CalculoTarifasStrategy{
        @Override
        public double calcularTarifa(Direccion origen, Direccion destino, double peso) {
            double costoBase = 8000.0;
            double costoPeso = peso * 1500.0;
            return costoBase + costoPeso;
        }

        @Override
        public String getNombreEstrategia() {
            return "Tarifa Express";
        }
}

