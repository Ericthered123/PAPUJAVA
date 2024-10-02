package classes;

import java.util.Objects;

public class Estadio {

    private String ubicacion;
    private String nombre;
    private int capacity;


    public Estadio(String ubicacion, String nombre, int capacity) {
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.capacity = capacity;
    }

    public Estadio(){}


    public String getUbicacion() {
        return ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacity() {
        return capacity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estadio estadio)) return false;
        return capacity == estadio.capacity && Objects.equals(ubicacion, estadio.ubicacion) && Objects.equals(nombre, estadio.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ubicacion, nombre, capacity);
    }

    @Override
    public String toString() {
        return "Estadio{" +
                "ubicacion='" + ubicacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
