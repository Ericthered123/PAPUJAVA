package Classes;

public class SuperaCantidadExtraccionesException extends Exception{
    private String name;
    private int limiteMax;
    private double valor;
    public SuperaCantidadExtraccionesException(String name, int lim,  double val) {
        this.name = name;
        this.limiteMax = lim;
        this.valor = val;
    }

    public String getMessage() {
        return"La cuenta :" + name + " quiso extraer " + valor + " pero como el limMax de extracciones es : " + limiteMax + "  NO SE PUDO CONCRETAR...ERROR";
    }


}
