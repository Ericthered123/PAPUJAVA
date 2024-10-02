package Classes;

import java.util.Timer;

public class EjemploInterface {

    public static void main(String[] args) {
        Vehiculo v1= new Bicicleta("FirePhoenix",30);
        Vehiculo v2= new Auto("Ferrari", 300);

        v1.acelerate();
        v1.stop();
        for (int i = 0; i < 10; i++) {
            v2.acelerate();

        }

        v2.stop();
    }
}
