package co.edu.uniquindio.ProyectoFinal.model.Patrones.Behavioral.Strategy;

import co.edu.uniquindio.ProyectoFinal.model.model.Direccion;

public class TarifaEstandarStrategy implements CalculoTarifasStrategy{

        @Override
        public double calcularTarifa(Direccion origen, Direccion destino, double peso) {
            double costoBase = 5000.0;
            double costoPeso = peso * 1000.0;
            return costoBase + costoPeso;
        }
        @Override
        public String getNombreEstrategia() {
            return "Tarifa Estándar";
        }
  }

