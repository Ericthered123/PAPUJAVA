package Classes;

import java.util.Objects;

public abstract class Animal implements Hablador {

    private String name;
    private String raza;


    public Animal(){}
    public Animal(String name, String raza) {
        this.name = name;
        this.raza = raza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return Objects.equals(name, animal.name) && Objects.equals(raza, animal.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, raza);
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    public abstract void habla();


}
