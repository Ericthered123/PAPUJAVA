package Classes;

import java.time.LocalDate;
import java.util.Objects;

public class Pasajero extends Persona implements Frecuencia{

    private double millasAcumuladas;

    private LocalDate lastTrip;

    public Pasajero(){}

    public Pasajero(String name, int age){
        super(name,age);
        this.millasAcumuladas=0;
        this.lastTrip=LocalDate.EPOCH;
    }

    public double getMillasAcumuladas() {
        return millasAcumuladas;
    }

    public LocalDate getLastTrip() {
        return lastTrip;
    }

    public void addMillasAcumuladas(double millas) {
        this.millasAcumuladas += millas;
    }

    public void setLastTrip(LocalDate lastTrip) {
        this.lastTrip = lastTrip;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "Name=" + getNombre() +
                "millasAcumuladas=" + millasAcumuladas +
                ", lastTrip=" + lastTrip +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pasajero pasajero)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(getMillasAcumuladas(), pasajero.getMillasAcumuladas()) == 0 && Objects.equals(getLastTrip(), pasajero.getLastTrip());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMillasAcumuladas(), getLastTrip());
    }

    @Override
    public double millas() {
        return getMillasAcumuladas();
    }

    @Override
    public LocalDate ultimoViaje() {
        return getLastTrip();
    }
}
