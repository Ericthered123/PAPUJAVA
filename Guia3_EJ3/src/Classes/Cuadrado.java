package Classes;

public class Cuadrado extends Figura implements FiguraGeometrica{

    private double lado;

    public Cuadrado(){
        super();
    }
    public Cuadrado(String color,Punto origen,double lado){
        super(origen, color);
        this.lado = lado;
    }
    public Cuadrado(String color,double lado){
        super(color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }

    @Override
    public void mover(int value, Direccion direccion) {

    }

    @Override
    public double area() {
        return getLado()*getLado();
    }
}
