package classes;

import java.util.Objects;

public class Jugador {


    private String name;
    private String position;
    private int age;
    private String currentClub;

    public Jugador() {}

    public Jugador(String name, String position, int age, String currentClub) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.currentClub = currentClub;

    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public String getCurrentClub() {
        return currentClub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jugador jugador)) return false;
        return age == jugador.age && Objects.equals(name, jugador.name) && Objects.equals(position, jugador.position) && Objects.equals(currentClub, jugador.currentClub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, age, currentClub);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", currentClub='" + currentClub + '\'' +
                '}';
    }
}
