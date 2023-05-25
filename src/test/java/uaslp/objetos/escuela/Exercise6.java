package uaslp.objetos.escuela;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise6 {

     /*
    INSTRUCCIONES EJERCICIO 6:

    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX

    En este ejercicio los tests que crees deberán estar en esta clase, es el UNICO
    ejercicio en el que se te permite modificar el Unit Test, PERO está prohibido
    modificar el test existente "validarInterfacesCreadas"

     */

    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }

    @Test
    public void whenAAndBAreEqualThenSaveIsCalled() {

        //given
        DependenciaStub dependencia = new DependenciaStub();
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia, dependencia, dependencia);

        int a = 8;
        int b = 8;
        String c = "test string";

        //when
        algoritmoX.algoritmoACubrir(a, b, c);

        //then
        Assertions.assertTrue(dependencia.hasSaved());
        Assertions.assertTrue(dependencia.hasRecovered());

    }

    @Test
    public void whenBIsGreaterThanAThenPrintIsCalled() {

        //given
        DependenciaStub dependencia = new DependenciaStub();
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia, dependencia, dependencia);

        int a = 0;
        int b = 10;
        String c = "test string";

        //when
        algoritmoX.algoritmoACubrir(a, b, c);

        //then
        Assertions.assertTrue(dependencia.hasPrinted());
        Assertions.assertTrue(dependencia.hasRecovered());

    }

    @Test
    public void whenAIsGreaterThanBThenSendIsCalled() {

        //given
        DependenciaStub dependencia = new DependenciaStub();
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia, dependencia, dependencia);

        int a = 10;
        int b = 0;
        String c = "test string";

        //when
        algoritmoX.algoritmoACubrir(a, b, c);

        //then
        Assertions.assertTrue(dependencia.hasSent());
        Assertions.assertTrue(dependencia.hasRecovered());

    }

}
