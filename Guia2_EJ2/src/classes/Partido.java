package classes;

import java.time.LocalDateTime;
import java.util.Objects;

public class Partido {

    private Estadio estadio;
    private Equipo team1;
    private Equipo team2;
    private double valueEntry;
    private LocalDateTime fecha;


    public Partido() {}

    public Partido(Estadio estadio, Equipo team1, Equipo team2,double valueEntry){
        this.estadio = estadio;
        this.team1 = team1;
        this.team2 = team2;
        this.valueEntry = valueEntry;
        this.fecha = LocalDateTime.now();
    }


    public Partido(Estadio estadio, Equipo team1, Equipo team2,double valueEntry,int month,int day,int hour,int minute) {
        this.estadio = estadio;
        this.team1 = team1;
        this.team2 = team2;
        this.valueEntry = valueEntry;
        this.fecha = LocalDateTime.of(2024,month,day,hour,minute);
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public Equipo getTeam1() {
        return team1;
    }

    public Equipo getTeam2() {
        return team2;
    }

    public double getValueEntry() {
        return valueEntry;
    }

    public int capacity(){
        return getEstadio().getCapacity();
    }
    public void setValueEntry(double valueEntry) {
        this.valueEntry = valueEntry;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "estadio=" + estadio +
                ", team1=" + team1 +
                ", team2=" + team2 +
                ", valueEntry=" + valueEntry +
                ", fecha=" + fecha +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Partido partido)) return false;
        return Double.compare(valueEntry, partido.valueEntry) == 0 && Objects.equals(estadio, partido.estadio) && Objects.equals(team1, partido.team1) && Objects.equals(team2, partido.team2) && Objects.equals(fecha, partido.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estadio, team1, team2, valueEntry, fecha);
    }


    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public double getTotalValue(){
        return getEstadio().getCapacity()*getValueEntry();
    }











}
