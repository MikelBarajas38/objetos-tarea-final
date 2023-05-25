package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {

    static final SalaDeJuntas salaDeJuntasA = new SalaDeJuntas("Sala A");
    static final SalaDeJuntas salaDeJuntasB = new SalaDeJuntas("Sala B");
    static final SalaDeJuntas salaDeJuntasC = new SalaDeJuntas("Sala C");

    static SalaDeJuntas get(String sala) {
        return switch (sala) {
            case "Sala A" -> salaDeJuntasA;
            case "Sala B" -> salaDeJuntasB;
            case "Sala C" -> salaDeJuntasC;
            default -> null;
        };
    }

}
