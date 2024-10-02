package Classes;

public class Alumno extends Cliente{

    public Alumno(String name, int age) {
        super(name, age);
    }

    @Override
    public double getDescuento(double n) {
        return n-(n*0.20);
    }
}
