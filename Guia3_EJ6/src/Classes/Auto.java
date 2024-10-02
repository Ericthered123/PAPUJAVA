package Classes;

import java.util.Objects;

public class Auto implements Vehiculo{
    private String marca;
    private double velocidadActual;
    private double velocidadMaxima;
    //motor
    //combustible
    //patente

    public Auto(String marca,double velocidadMaxima) {
        this.marca = marca;
        this.velocidadActual = 0;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto auto)) return false;
        return Objects.equals(getMarca(), auto.getMarca());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMarca());
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", velocidadActual=" + velocidadActual +
                ", velocidadMaxima=" + velocidadMaxima +
                '}';
    }

    @Override
    public void acelerate() {
        if (getVelocidadActual()<=getVelocidadMaxima()) {
            this.velocidadActual += 15;
            System.out.println("Auto acelerando. Velocidad actual: " + getVelocidadActual() + " KM/H");
        }
        else {
            System.out.println("Max Speed Reached!!!");
        }
    }

    @Override
    public void stop() {
        this.velocidadActual = 0;
        System.out.println("Stopped!");

    }
}
