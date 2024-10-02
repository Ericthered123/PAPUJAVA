package Classes;

import java.util.Objects;

public class Bicicleta implements Vehiculo{
    private String marca;
    private double velocidadActual;
    private double velocidadMax;

    public Bicicleta(String marca, double velocidadMax) {
        this.marca = marca;
        this.velocidadActual = 0;
        this.velocidadMax = velocidadMax;
    }

    public String getMarca() {
        return marca;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bicicleta bicicleta)) return false;
        return Objects.equals(getMarca(), bicicleta.getMarca());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMarca());
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", velocidadActual=" + velocidadActual +
                ", velocidadMax=" + velocidadMax +
                '}';
    }

    @Override
    public void acelerate() {
        if (getVelocidadActual()<=getVelocidadMax()) {
            this.velocidadActual += 5;
            System.out.println("Bici acelerando. Velocidad actual: " + getVelocidadActual() + " KM/H");
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
