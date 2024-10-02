package Classes;

public interface FiguraGeometrica {


    //Declarar constantes.

    String NORTE= "Norte";
    String SUR= "Sur";
    String OESTE="Oeste";
    String ESTE="Este";

    public void mover(int value, String direccion);

    public double area();

    public Punto getOrigen();

    default public void imprimir(){
        System.out.println(this.toString()+ area());
    }


}
