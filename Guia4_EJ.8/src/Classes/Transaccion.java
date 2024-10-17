package Classes;

import java.time.LocalDate;
import java.util.Objects;

public class Transaccion {

    private LocalDate fecha;
    private double monto;
    private String type;


    public Transaccion(){}

    public Transaccion( double monto, String type) {
        this.fecha = LocalDate.now();
        this.monto = monto;
        this.type = type;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getMonto() {
        return monto;
    }

    public String getType() {
        return type;
    }


    @Override
    public String toString() {
        return "Transaccion{" +
                "fecha=" + fecha +
                ", monto=" + monto +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaccion that)) return false;
        return Double.compare(getMonto(), that.getMonto()) == 0 && Objects.equals(getFecha(), that.getFecha()) && Objects.equals(getType(), that.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFecha(), getMonto(), getType());
    }
}
