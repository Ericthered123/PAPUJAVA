package prototypeAndStrategy;

public class Cuadrado extends PrototypeShape{
    private int lado;

    public Cuadrado(String color,int x, int y,int lado) {
        super(x,y,color);

        this.lado = lado;
    }
    public Cuadrado(Cuadrado source){
        super(source);
        this.lado = source.lado;

    }

    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }

    public PrototypeShape clone(){
        return new Cuadrado(this);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado + "Color=" + getColor() +
                '}';
    }
}
