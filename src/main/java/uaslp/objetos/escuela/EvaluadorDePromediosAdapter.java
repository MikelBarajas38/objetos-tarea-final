package uaslp.objetos.escuela;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;

public class EvaluadorDePromediosAdapter implements Evaluador{

    final EvaluadorDePromedios evaluador;

    EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluador) {
        this.evaluador = evaluador;
    }

    public double evalua(String calificaciones) {

        return evaluador.evalua(parseCalificacionesString(calificaciones));

    }

    private List<Double> parseCalificacionesString(String calificaciones) {
        List<Double> listaDeCalificaciones = new ArrayList<>();

        for(String calificacion : calificaciones.split(",")){
            listaDeCalificaciones.add(parseDouble(calificacion));
        }

        return listaDeCalificaciones;
    }

}
