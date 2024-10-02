package Classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Vehiculo implements Frecuencia{
    private int patente;
    private String marca;
    private String modelo;
    private ArrayList<Pasajero> pasajeros;
    private double millasAcumuladas;
    private LocalDate lastTrip;


    public Vehiculo(){}

    public Vehiculo(int patente,String marca, String modelo, ArrayList<Pasajero> pasajeros){
        this.marca = marca;
        this.patente=patente;
        this.modelo = modelo;
        this.pasajeros = pasajeros;
        this.millasAcumuladas=0;
        this.lastTrip = LocalDate.EPOCH;
    }
    public Vehiculo(int patente,String marca, String modelo){
        this.marca = marca;
        this.patente=patente;
        this.modelo = modelo;
        this.pasajeros = new ArrayList<>();
        this.millasAcumuladas=0;
        this.lastTrip = LocalDate.EPOCH;
    }

    public String getModelo() {
        return modelo;
    }
    public int getPatente(){
        return patente;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void addMillasAcumuladas(double millasAcumuladas) {
        this.millasAcumuladas += millasAcumuladas;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void addPasajero(Pasajero p){
        getPasajeros().add(p);
    }
    public double getMillasAcumuladas() {
        return millasAcumuladas;
    }

    public void viajar(double millas){
        if (millas<=0 ){
            System.out.println("Millas deben ser positivas");
            return;
        }

        addMillasAcumuladas(millas);
        setLastTrip(LocalDate.now());
        for (Pasajero p : getPasajeros()){
            p.addMillasAcumuladas(millas);
            p.setLastTrip(LocalDate.now());
        }

    }

    public LocalDate getLastTrip() {
        return lastTrip;
    }

    public void setLastTrip(LocalDate lastTrip) {
        this.lastTrip = lastTrip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo vehiculo)) return false;
        return Double.compare(getMillasAcumuladas(), vehiculo.getMillasAcumuladas()) == 0 && Objects.equals(getMarca(), vehiculo.getMarca()) && Objects.equals(getModelo(), vehiculo.getModelo()) && Objects.equals(getPasajeros(), vehiculo.getPasajeros()) && Objects.equals(getLastTrip(), vehiculo.getLastTrip());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMarca(), getModelo(), getPasajeros(), getMillasAcumuladas(), getLastTrip());
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pasajeros=" + pasajeros +
                ", millasAcumuladas=" + millasAcumuladas +
                ", lastTrip=" + lastTrip +
                '}';
    }

    @Override
    public double millas() {
        return getMillasAcumuladas();
    }

    @Override
    public LocalDate ultimoViaje() {
        if (getLastTrip()==LocalDate.EPOCH){
            System.out.println("NO trip made yet");
            return null;
        }
        return getLastTrip();
    }
}
