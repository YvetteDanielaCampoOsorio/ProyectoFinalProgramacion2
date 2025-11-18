package co.edu.uniquindio.ProyectoFinal.model.Dominio;

public class Direccion {
    private String alias,calle,ciudad;
    public Direccion(String alias, String calle, String ciudad) {
        this.alias = alias;
        this.calle = calle;
        this.ciudad = ciudad;
    }
    public void actualizar(String calle,String ciudad){
        this.calle = calle;
        this.ciudad = ciudad;
    }

    public String getAlias() {
        return alias;
    }

    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}