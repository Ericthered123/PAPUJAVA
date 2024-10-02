package Classes;

import java.util.Objects;

public class Triangulo extends Figura implements FiguraGeometrica{

    private double altura;
    private double base;


    public Triangulo(){
        super();
    }
    public Triangulo(String color, double altura, double base) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    public Triangulo(String color, Punto origen,double altura, double base){
        super(origen, color);
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "altura=" + altura +
                ", base=" + base +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangulo triangulo)) return false;
        return Double.compare(getAltura(), triangulo.getAltura()) == 0 && Double.compare(getBase(), triangulo.getBase()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAltura(), getBase());
    }

    @Override
    public void mover(int value, Direccion direccion) {

    }

    @Override
    public double area() {
        return (getAltura()*getBase())/2;
    }
}
