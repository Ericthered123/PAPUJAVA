package Classes;

public interface FiguraGeometrica {


    //Declarar constantes.

    String NORTE= "Norte";
    String SUR= "Sur";
    String OESTE="Oeste";
    String ESTE="Este";

    public void mover(int value, Direccion direccion);

    public double area();

    public Punto getOrigen();

}
