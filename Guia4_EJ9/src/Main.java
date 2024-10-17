/*Vamos a implementar una simulación de una guerra entre dos robots utilizando el
patrón de diseño Strategy en Java. Para ello, definiremos varias estrategias de ataque
y defensa, y cada robot tendrá varias estrategias de ataque y defensa. Cada vez que un
robot ataca o se defiende, se restará puntos de vida según la estrategia utilizada.
Las estrategias de ataque y defensa se deberán seleccionar de manera random,

El juego se desarrollará por turnos hasta que uno de los robots llegue a 0 puntos de vida.*/

import Classes.*;

public class Main {
    public static void main(String[] args) {


        Robot r1 = new Robot("Eri");
        Robot r2 = new Robot("Feli");
        Robot r3 = new Robot("Tute");
        Robot r4 = new Robot("Pedro");
        //Battle batalla = new Battle(r1,r2);

        //batalla.start();


        BigBattle b1 = new BigBattle();

        b1.addRobot(r1);
        b1.addRobot(r2);
        b1.addRobot(r3);
        b1.addRobot(r4);

        b1.start();


    }

}
