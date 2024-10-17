package Classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class CuentaBancaria {

    private double saldoActual;
    private double limiteMinExtracc;
    private Persona titular;
    private LocalDate apertureDate;
    private List<Transaccion> transaccions;

    public CuentaBancaria(double limiteMinExtracc, Persona titular,double saldo) {
        this.transaccions = new ArrayList<>();
        this.saldoActual = saldo;
        this.limiteMinExtracc = limiteMinExtracc;
        this.titular = titular;
        this.apertureDate = LocalDate.now();

    }

    public void addTransaccion(Transaccion transaccion) {
        getTransaccions().add(transaccion);
    }

    public void transferir(double value,String type) throws SuperaLimiteMinimoException {
        Transaccion tr = new Transaccion(value,type);
        try {
            extraer(value);
        } catch (SuperaCantidadExtraccionesException e) {
            System.out.println(e.getMessage());
        }
        addTransaccion(tr);
        System.out.println("Transaccion realizada");

    }

    public abstract void extraer(double value) throws SuperaCantidadExtraccionesException,SuperaLimiteMinimoException;

    public void depositar(double valor){
        setSaldoActual(getSaldoActual()+valor);
    }
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getLimiteMinExtracc() {
        return limiteMinExtracc;
    }

    public Persona getTitular() {
        return titular;
    }

    public LocalDate getApertureDate() {
        return apertureDate;
    }

    public List<Transaccion> getTransaccions() {
        return transaccions;
    }


    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldoActual=" + saldoActual +
                ", limiteMinExtracc=" + limiteMinExtracc +
                ", Titular=" + titular +
                ", apertureDate=" + apertureDate +
                ", transaccions=" + transaccions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CuentaBancaria that)) return false;
        return Double.compare(getSaldoActual(), that.getSaldoActual()) == 0 && Double.compare(getLimiteMinExtracc(), that.getLimiteMinExtracc()) == 0 && Objects.equals(getTitular(), that.getTitular()) && Objects.equals(getApertureDate(), that.getApertureDate()) && Objects.equals(getTransaccions(), that.getTransaccions());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSaldoActual(), getLimiteMinExtracc(), getTitular(), getApertureDate(), getTransaccions());
    }
}
