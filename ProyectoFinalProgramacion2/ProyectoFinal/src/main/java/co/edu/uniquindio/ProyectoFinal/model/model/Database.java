package co.edu.uniquindio.ProyectoFinal.model.model;

import java.util.ArrayList;
import java.util.List;

public class Database {

        private static Database inst;
        private List<Usuario> usuarios=new ArrayList<>();
        private List<Envio> envios=new ArrayList<>();
        private List<Repartidor> reps=new ArrayList<>();
        private Database(){
            usuarios.add(new Usuario("U1","Carlos","c@mail.com","123"));
            reps.add(new Repartidor("R1","Juan","Centro"));
        }
        public static Database getInstance(){return inst==null?inst=new Database():inst;}
        public List<Usuario> getUsuarios(){return usuarios;}
        public List<Envio> getEnvios(){return envios;}
        public List<Repartidor> getRepartidores(){return reps;}

}
