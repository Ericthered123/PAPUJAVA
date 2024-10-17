package Classes;

public class SuperaLimiteMinimoException extends Exception {

    private String name;
    private double limiteMin;
    private double saldo;
    private double valor;
    public SuperaLimiteMinimoException(String name, double lim, double sal, double val) {
        this.name = name;
        this.limiteMin = lim;
        this.saldo = sal;
        this.valor = val;
    }

    public String getMessage() {
        return"La cuenta :" + name + " quiso extraer " + valor + " pero como su saldo es :" + saldo +" y el limMinimo es: " + limiteMin+ " ; NO SE PUDO CONCRETAR...ERROR";
    }



}
