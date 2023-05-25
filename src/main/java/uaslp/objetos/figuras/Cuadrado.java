package uaslp.objetos.figuras;

public class Cuadrado extends Figura{

    private double lado;

    Cuadrado() {
        super("Cuadrado");
    }

    Cuadrado(double lado) {
        this();
        this.lado = lado;
    }

    public double getArea() {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
