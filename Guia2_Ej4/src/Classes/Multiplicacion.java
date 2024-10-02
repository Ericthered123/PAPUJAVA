package Classes;

public class Multiplicacion extends OperacionAritmetica{

    public Multiplicacion() {}
    public Multiplicacion(Operacion a, Operacion b) {
        super(a, b);
    }

    @Override
    public double calculate() {
        return getIzq().calculate()* getDer().calculate();
    }
}
