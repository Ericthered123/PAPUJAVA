package Classes;

import java.util.Objects;

public abstract class Figura implements FiguraGeometrica {


    private Punto origen;
    private String color;
    public Figura(){
        origen=new Punto(0,0);
    }
    public Figura(String color){
        origen = new Punto(0,0);
        this.color=color;

    }

    public Figura(Punto origen, String color) {
        this.origen = origen;
        this.color = color;
    }

    public Punto getOrigen() {
        return origen;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Figura figura)) return false;
        return Objects.equals(getOrigen(), figura.getOrigen()) && Objects.equals(getColor(), figura.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrigen(), getColor());
    }

    @Override
    public String toString() {
        return "Figura{" +
                "origen=" + origen +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void mover(int value, Direccion direccion) {

        switch (direccion){
            case NORTE:
                getOrigen().mover(0, value);
                break;
            case SUR:
                getOrigen().mover(0, -value);
                break;
            case OESTE:
                getOrigen().mover(-value,0);
                break;
            case ESTE:
                getOrigen().mover(value, 0);
                break;
            default:
                System.out.println("La direccion no es valida");
                break;
        }

    }
}
