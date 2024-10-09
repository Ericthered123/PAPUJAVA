package Classes;

import java.util.Objects;

public class Par < T, V > {

    private T x;
    private V y;



    public Par(){

    }

    public Par(T x, V y){
        this.x = x;
        this.y = y;

    }




    public V getY() {
        return y;
    }

    public void setY(V y) {
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Par<?, ?> par)) return false;
        return Objects.equals(getX(), par.getX()) && Objects.equals(getY(), par.getY());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }

    @Override
    public String toString() {
        return "Par(" +
                "x=" + x +
                ", y=" + y +
                ')';
    }

    public void showPar(){

        System.out.println("Par: (" + getX() + ", " + getY() + ")");

    }

}
