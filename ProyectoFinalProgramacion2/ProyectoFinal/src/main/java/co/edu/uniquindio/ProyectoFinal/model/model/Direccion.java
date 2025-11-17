package co.edu.uniquindio.ProyectoFinal.model.model;

public class Direccion {
    private String alias,calle,ciudad;
    public Direccion(String a,String c,String ci){alias=a;calle=c;ciudad=ci;}
    public void actualizar(String c,String ci){calle=c;ciudad=ci;}
    public String getAlias(){return alias;}

}
