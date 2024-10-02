package Classes;

import java.math.BigInteger;
import java.time.Instant;

public class EjemploInstant {
    public static void main(String[] args) {
        Instant instante = Instant.now();
        System.out.println(instante);
        Instant epoch= Instant.EPOCH;
        System.out.println(epoch);

        boolean esBefore= epoch.isBefore(instante);
        System.out.println(esBefore);



    }





}
