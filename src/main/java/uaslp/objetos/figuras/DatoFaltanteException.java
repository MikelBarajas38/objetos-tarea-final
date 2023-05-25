package uaslp.objetos.figuras;

public class DatoFaltanteException extends RuntimeException{

    DatoFaltanteException() {

    }

    DatoFaltanteException(String message) {
        super(message);
    }

}
