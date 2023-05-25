package uaslp.objetos.figuras;

public class Triangulo extends Figura{

    private double base;
    private double altura;

    private boolean baseIsSet = false;
    private boolean alturaIsSet = false;

    Triangulo() {
        super("Triangulo", "Cualquier triangulo");
    }

    Triangulo(double base, double altura) {
        this();
        this.base = base;
        this.altura = altura;
        baseIsSet = true;
        alturaIsSet = true;
    }

    public double getArea() {
        validateBase();
        validateAltura();
        return base * altura / 2;
    }

    public double getBase() {
        validateBase();
        return base;
    }

    public void setBase(double base) {
        this.base = base;
        baseIsSet = true;
    }

    public double getAltura() {
        validateAltura();
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        alturaIsSet = true;
    }

    private void validateAltura() {
        if(!alturaIsSet) {
            throw new AlturaNoProvistaException();
        }
    }

    private void validateBase() throws BaseNoProvistaException{
        if(!baseIsSet) {
            throw new BaseNoProvistaException();
        }
    }

}
