package co.edu.uniquindio.ProyectoFinal.model.dto;

public class UsuarioDTO {

        private String idUsuario;
        private String nombre;
        private String correo;
        private String telefono;

        public UsuarioDTO(String idUsuario, String nombre, String correo, String telefono) {
            this.idUsuario = idUsuario;
            this.nombre = nombre;
            this.correo = correo;
            this.telefono = telefono;
        }

        public String getIdUsuario() { return idUsuario; }
        public String getNombre() { return nombre; }
        public String getCorreo() { return correo; }
        public String getTelefono() { return telefono; }

        public void setNombre(String nombre) { this.nombre = nombre; }
        public void setCorreo(String correo) { this.correo = correo; }
        public void setTelefono(String telefono) { this.telefono = telefono; }
    }

