package co.edu.uniquindio.ProyectoFinal.model.Patrones.Behavioral.Strategy;

import co.edu.uniquindio.ProyectoFinal.model.model.Direccion;

public class TarifaEconomicaStrategy implements CalculoTarifasStrategy{

        @Override
        public double calcularTarifa(Direccion origen, Direccion destino, double peso) {
            double costoBase = 3000.0;
            double costoPeso = peso * 800.0;
            return costoBase + costoPeso;
        }

        @Override
        public String getNombreEstrategia() {
            return "Tarifa Económica";
        }
}
