package Classes;

public abstract class OperacionAritmetica implements Operacion{

    private Operacion izq;
    private Operacion der;

    public OperacionAritmetica(){}
    public OperacionAritmetica(Operacion izq, Operacion der){
        this.izq = izq;
        this.der = der;
    }

    public Operacion getIzq() {
        return izq;
    }
    public Operacion getDer(){
        return der;
    }

    @Override
    public abstract double calculate();
}
