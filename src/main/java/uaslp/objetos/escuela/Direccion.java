package uaslp.objetos.escuela;

public class Direccion {

    private static Direccion instance = null;

    private Direccion() {

    }

    public static Direccion getInstance() {

        if(instance == null){
            instance = new Direccion();
        }

        return instance;
    }

}
