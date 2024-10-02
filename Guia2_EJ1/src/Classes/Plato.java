package Classes;

import java.util.Objects;

public class Plato {
    private double precio;
    private String nombre;
    private DiaSemana diaDisponible;

    public Plato (double precio, String nombre, DiaSemana diaDisponible) {
        this.precio = precio;
        this.nombre = nombre;
        this.diaDisponible = diaDisponible;
    }
    public Plato(){
    }
    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public DiaSemana getDiaDisponible() {
        return diaDisponible;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", diaDisponible=" + diaDisponible +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plato plato)) return false;
        return Double.compare(precio, plato.precio) == 0 && Objects.equals(nombre, plato.nombre) && diaDisponible == plato.diaDisponible;
    }

    @Override
    public int hashCode() {
        return Objects.hash(precio, nombre, diaDisponible);
    }



}
