package co.edu.uniquindio.ProyectoFinal.model.Patrones.Structural.decorator;

public class FragilDecorator extends ServicioAdicionalDecorator{

        private double costoManejoEspecial;

        public FragilDecorator(ServicioEnvio servicioDecorado, double costoManejoEspecial) {
            super(servicioDecorado);
            this.costoManejoEspecial = costoManejoEspecial;
        }

        @Override
        public String getDescripcion() {
            return servicioDecorado.getDescripcion() + " + Frágil";
        }

        @Override
        public double calcularCosto() {
            return servicioDecorado.calcularCosto() + costoManejoEspecial;
        }

        @Override
        public String getDetallesServicio() {
            return servicioDecorado.getDetallesServicio() +
                    "\n- Manejo especial para artículos frágiles";
        }
}

