package co.edu.uniquindio.ProyectoFinal.model.Patrones.Structural.decorator;

public class FirmaRequeridaDecorator extends ServicioAdicionalDecorator{

        private double costoServicio;

        public FirmaRequeridaDecorator(ServicioEnvio servicioDecorado, double costoServicio) {
            super(servicioDecorado);
            this.costoServicio = costoServicio;
        }

        @Override
        public String getDescripcion() {
            return servicioDecorado.getDescripcion() + " + Firma Requerida";
        }

        @Override
        public double calcularCosto() {
            return servicioDecorado.calcularCosto() + costoServicio;
        }

        @Override
        public String getDetallesServicio() {
            return servicioDecorado.getDetallesServicio() +
                    "\n- Firma requerida en el momento de la entrega";
        }
}
