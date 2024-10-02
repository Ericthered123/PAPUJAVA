package Classes;

import java.util.Objects;

public class Persona {

    private String nombre;
    private int age;

    public Persona(){}

    public Persona(String nombre, int age) {
        this.nombre = nombre;
        this.age = age;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;
        return age == persona.age && Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, age);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", age=" + age +
                '}';
    }
}
