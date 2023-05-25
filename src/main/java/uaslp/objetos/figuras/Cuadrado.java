package uaslp.objetos.figuras;

public class Cuadrado {

    private double lado;

    Cuadrado() {

    }

    Cuadrado(double lado) {
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
