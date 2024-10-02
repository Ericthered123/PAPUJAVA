package Classes;

import java.math.*;
import java.util.Objects;

public class Circulo extends Figura implements FiguraGeometrica{

    private double radius;


    public Circulo() {
        super();
    }

    public Circulo(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circulo(Punto origen, String color, double radius) {
        super(origen, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circulo circulo)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(getRadius(), circulo.getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRadius());
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(getRadius(), 2);
    }
}
