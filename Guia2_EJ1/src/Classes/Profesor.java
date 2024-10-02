package Classes;

public class Profesor extends Cliente{

    public Profesor(String name, int age) {
        super(name, age);
    }

    @Override
    public double getDescuento(double n) {
        return n-(n*0.10);
    }
}
