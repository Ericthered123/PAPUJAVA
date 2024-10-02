package Classes;

public class Numero implements Operacion{
    
    private double valor;
    
    public Numero() {

    }
    public Numero(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double calculate() {
        return valor;
    }
}
