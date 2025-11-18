package co.edu.uniquindio.ProyectoFinal.controllers;

// IMPORTS VAN AQUÍ, NO DENTRO DE LA CLASE
import co.edu.uniquindio.ProyectoFinal.model.Patrones.Creational.GestorDatos;
import co.edu.uniquindio.ProyectoFinal.model.model.Usuario;
import co.edu.uniquindio.ProyectoFinal.utils.SceneManager;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import java.util.UUID;  // <--- ESTE IMPORT VA AQUÍ, CON LOS OTROS

public class RegistroUsuarioController {

    @FXML private TextField txtNombre;
    @FXML private TextField txtCorreo;
    @FXML private TextField txtTelefono;
    @FXML private PasswordField txtPassword;

    public void handleCrearCuenta() {
        String nombre = txtNombre.getText();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();
        String password = txtPassword.getText();

        if (nombre.isEmpty() || correo.isEmpty() || telefono.isEmpty() || password.isEmpty()) {
            mostrarAlerta("Error", "Todos los campos son obligatorios.");
            return;
        }

        // Crear usuario
        String id = UUID.randomUUID().toString();
        Usuario nuevoUsuario = new Usuario(id, nombre, correo, password);

        GestorDatos.getInstance().agregarUsuario(nuevoUsuario);

        // Ver en consola
        System.out.println("Usuarios registrados:");
        GestorDatos.getInstance().getUsuarios().forEach(u -> {
            System.out.println("ID: " + u.getId() + " | Nombre: " + u.getNombre() + " | Correo: " + u.getEmail());
        });

        mostrarAlerta("Registro exitoso", "El usuario ha sido creado correctamente.");
        SceneManager.cambiarEscena("Login.fxml");
    }

    public void handleVolver() {
        SceneManager.cambiarEscena("Login.fxml");
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
