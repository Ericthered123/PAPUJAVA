package Classes;

import java.util.Objects;

public class Rectangulo extends Figura implements  FiguraGeometrica{

    private double base;
    private double altura;


    public Rectangulo(String color,double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;


    }
    public Rectangulo(String color,Punto origen,double base, double altura) {
        super(origen, color);
        this.base = base;
        this.altura = altura;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangulo that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(getBase(), that.getBase()) == 0 && Double.compare(getAltura(), that.getAltura()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBase(), getAltura());
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }



    @Override
    public double area() {
        return getAltura() * getBase();
    }
}
