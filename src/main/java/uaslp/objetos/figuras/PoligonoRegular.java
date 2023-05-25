package uaslp.objetos.figuras;

public class PoligonoRegular extends Figura{

    private int numeroDeLados;
    private double lado;

    PoligonoRegular() {
        super("Poligono Regular");
    }

    PoligonoRegular(int numeroDeLados) {
        this();
        this.numeroDeLados = numeroDeLados;
    }

    PoligonoRegular(int numeroDeLados, double lado) {
        this();
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public double getArea() {;
        return getPerimetro() * getApotema() / 2;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    private double getPerimetro() {
        return lado * numeroDeLados;
    }

    private double getApotema() {
        double anguloInterior = Math.toRadians(360 / (numeroDeLados * 2));
        return lado / (2 * Math.tan(anguloInterior));
    }
}
