package Classes;

public class Particular extends Cliente{

    public Particular(String name, int age) {
        super(name, age);
    }

    @Override
    public double getDescuento(double n) {
        return n-(n*0);
    }
}
