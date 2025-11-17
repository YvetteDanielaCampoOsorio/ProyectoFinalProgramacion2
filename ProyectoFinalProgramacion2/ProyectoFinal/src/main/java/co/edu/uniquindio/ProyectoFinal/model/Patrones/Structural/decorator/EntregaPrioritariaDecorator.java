package co.edu.uniquindio.ProyectoFinal.model.Patrones.Structural.decorator;

public class EntregaPrioritariaDecorator extends ServicioAdicionalDecorator{
        private double costoPrioridad;

        public EntregaPrioritariaDecorator(ServicioEnvio servicioDecorado, double costoPrioridad) {
            super(servicioDecorado);
            this.costoPrioridad = costoPrioridad;
        }

        @Override
        public String getDescripcion() {
            return servicioDecorado.getDescripcion() + " + Prioritaria";
        }

        @Override
        public double calcularCosto() {
            return servicioDecorado.calcularCosto() + costoPrioridad;
        }

        @Override
        public String getDetallesServicio() {
            return servicioDecorado.getDetallesServicio() +
                    "\n- Entrega prioritaria: Mismo día";
        }

}
