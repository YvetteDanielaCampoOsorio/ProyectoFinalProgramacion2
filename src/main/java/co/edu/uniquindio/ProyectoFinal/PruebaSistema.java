package co.edu.uniquindio.ProyectoFinal;


import co.edu.uniquindio.ProyectoFinal.model.Patrones.Creational.GestorDatos;
import co.edu.uniquindio.ProyectoFinal.model.model.*;

public class PruebaSistema {

    public static void main(String[] args) {

        GestorDatos gestor = GestorDatos.getInstance();

        // Crear usuario
        Usuario u1 = new Usuario("U1", "Sofía", "sofia@mail.com", "1234");
        gestor.agregarUsuario(u1);

        // Crear repartidor
        Repartidor r1 = new Repartidor("R1","Juan","Centro");
        gestor.agregarRepartidor(r1);

        // Crear direcciones
        Direccion origen = new Direccion("Casa", "Calle 10 #5-20", "MiCiudad");
        Direccion destino = new Direccion("Oficina", "Carrera 3 #12-45", "MiCiudad");

        // Crear envío usando el constructor que tienes (peso y volumen como double)
        double peso = 2.5;    // kg
        double volumen = 0.01; // m3 (ejemplo)
        Envio envio = new Envio(origen, destino, peso, volumen);

        // Asignar usuario y repartidor al envío
        envio.setUsuario(u1);
        envio.setRepartidor(r1);

        // opcional: calcular o fijar costo (si tu Envio no lo calcula automáticamente)
        envio.setCosto(gestor.getEnvios().size() >= 0 ? 10000.0 : 10000.0); // ejemplo

        // Guardar envío correctamente en el gestor
        gestor.agregarEnvio(envio);

        // Asociar envío al usuario (la lista de envíos del usuario es parte del modelo)
        u1.getEnvios().add(envio);

        // ✨ PRUEBA
        System.out.println("Usuario: " + u1.getNombre());
        Repartidor rep = u1.getRepartidor(envio);
        System.out.println("Repartidor del envío: " + (rep != null ? rep.getNombre() : "No asignado"));

        System.out.println("\n--- Repartidores del usuario ---");
        for (Repartidor r : u1.getRepartidores()) {
            System.out.println("• " + r.getNombre());
        }
    }
}