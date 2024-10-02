package Classes;

import java.util.Objects;

public abstract class Mueble {

    private String estilo;
    private int legs;
    private String material;

    public Mueble(String estilo, int legs, String material) {
        this.estilo = estilo;
        this.legs = legs;
        this.material = material;
    }
    public Mueble(String estilo){
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    public int getLegs() {
        return legs;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mueble mueble)) return false;
        return getLegs() == mueble.getLegs() && Objects.equals(getEstilo(), mueble.getEstilo()) && Objects.equals(getMaterial(), mueble.getMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEstilo(), getLegs(), getMaterial());
    }

    @Override
    public String toString() {
        return "Mueble{" +
                "estilo='" + estilo + '\'' +
                ", legs=" + legs +
                ", material='" + material + '\'' +
                '}';
    }
}
