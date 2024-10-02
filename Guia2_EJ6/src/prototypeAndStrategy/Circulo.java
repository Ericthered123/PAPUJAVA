package prototypeAndStrategy;

public class Circulo extends PrototypeShape {


    private double radius;
    private double area;

    public Circulo() {}

    public Circulo(String color,int x,int y,double radius) {
        super(x,y,color);
        this.radius = radius;
        this.area = Math.PI*Math.pow(radius, 2);
    }

    public Circulo(Circulo source){
        super(source);
        this.radius = source.radius;
        this.area = source.area;
    }

    public double getArea() {
        return area;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public PrototypeShape clone() {
        return new Circulo(this);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radius=" + radius +
                ", area=" + area + "Color=" + getColor() +
                '}';
    }
}
