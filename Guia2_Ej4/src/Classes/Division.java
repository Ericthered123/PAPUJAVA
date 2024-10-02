package Classes;

public class Division extends OperacionAritmetica {

    public Division() {}
    public Division(Operacion a, Operacion b) {
        super(a,b);
    }

    @Override
    public double calculate() {
        return getIzq().calculate()/ getDer().calculate();
    }
}
