package co.edu.uniquindio.ProyectoFinal.model.dto;

import co.edu.uniquindio.ProyectoFinal.model.model.Usuario;

public class UsuarioDTO {
        private String id;
        private String nombre;
        private String email;
        private int totalDirecciones;
        private int totalEnvios;

        public UsuarioDTO(Usuario usuario) {
            this.id = usuario.getId() != null ? usuario.getId() : "N/A";
            this.nombre = usuario.getNombre();
            this.email = usuario.getEmail();
            this.totalDirecciones = usuario.getDirecciones() != null ? usuario.getDirecciones().size() : 0;
            this.totalEnvios = usuario.getEnvios() != null ? usuario.getEnvios().size() : 0;
        }

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }

        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public int getTotalDirecciones() { return totalDirecciones; }
        public void setTotalDirecciones(int totalDirecciones) { this.totalDirecciones = totalDirecciones; }

        public int getTotalEnvios() { return totalEnvios; }
        public void setTotalEnvios(int totalEnvios) { this.totalEnvios = totalEnvios; }


        @Override
        public String toString() {
            return String.format("UsuarioDTO{id='%s', nombre='%s', email='%s', direcciones=%d, envios=%d}",
                    id, nombre, email, totalDirecciones, totalEnvios);
        }

}
