package Classes;

import java.time.LocalDate;

public class Chofer implements Frecuencia{
    private String name;
    private Colectivo colectivo;
    private double millasAcumuladas;

    public Chofer(String name, Colectivo colectivo) {
        this.name = name;
        this.colectivo = colectivo;
    }

    public Colectivo getColectivo() {
        return colectivo;
    }
    public void  viajar(double millas) {
        getColectivo().viajar(millas);
    }

    public void addMillasAcumuladas(double millas) {
        this.millasAcumuladas += millas;
    }

    @Override
    public double millas() {
        return getColectivo().millas();
    }

    @Override
    public LocalDate ultimoViaje() {
        return getColectivo().ultimoViaje();
    }

    public int getCantPas(){
        return getColectivo().getCantPasajeros();
    }

    public String getName() {
        return name;
    }


}
