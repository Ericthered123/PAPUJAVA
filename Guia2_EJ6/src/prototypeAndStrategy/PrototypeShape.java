package prototypeAndStrategy;

public abstract class PrototypeShape {

    private int x;
    private int y;
    private String color;

    public PrototypeShape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public PrototypeShape(){}

    public PrototypeShape(PrototypeShape source){
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public abstract PrototypeShape clone();

    @Override
    public String toString() {
        return "PrototypeShape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
