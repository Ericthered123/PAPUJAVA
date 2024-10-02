package Classes;

import java.util.Objects;

public abstract class Cliente {

    private String name;
    private int age;

    public Cliente(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Cliente(){}
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente cliente)) return false;
        return age == cliente.age && Objects.equals(name, cliente.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    abstract public double getDescuento(double n);
}
