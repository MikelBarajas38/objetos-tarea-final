package uaslp.objetos.figuras;

public class Cuadrado extends Figura{

    private double lado;

    private boolean ladoIsSet = false;

    Cuadrado() {
        super("Cuadrado");
    }

    Cuadrado(double lado) {
        this();
        this.lado = lado;
        ladoIsSet = true;
    }

    public double getArea() {
        validateLado();
        return lado * lado;
    }

    public double getLado() {
        validateLado();
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
        ladoIsSet = true;
    }

    private void validateLado() throws LadoNoProvistoException {
        if(!ladoIsSet) {
            throw new LadoNoProvistoException();
        }
    }

}
