package classes;

import java.util.ArrayList;
import java.util.Objects;

public class Equipo {

    private String name;
    private ArrayList<Jugador> jugadores;
    public Equipo() {}
    public Equipo(String name) {
        this.name = name;
        this.jugadores = new ArrayList<>();
    }
    public Equipo(String name, ArrayList<Jugador> jugadores) {
        this.name = name;
        this.jugadores = jugadores;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipo equipo)) return false;
        return Objects.equals(name, equipo.name) && Objects.equals(jugadores, equipo.jugadores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, jugadores);
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "name='" + name + '\'' +
                ", jugadores=" + jugadores +
                '}';
    }


    public void addJugador(Jugador jugador) {
        getJugadores().add(jugador);
    }
    public void removeJugador(Jugador jugador) {
        getJugadores().remove(jugador);
    }



}
