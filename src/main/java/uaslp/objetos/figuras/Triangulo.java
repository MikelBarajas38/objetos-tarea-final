package uaslp.objetos.figuras;

public class Triangulo extends Figura{

    private double base;
    private double altura;

    Triangulo() {
        super("Triangulo", "Cualquier triangulo");
    }

    Triangulo(double base, double altura) {
        this();
        this.base = base;
        this.altura = altura;
    }

    public double getArea() {
        return base * altura / 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
