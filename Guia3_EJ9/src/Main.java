import Classes.*;

import java.util.Comparator;

public class Main {


    public static void main(String[] args) {
        Numeros numeros = new Numeros();
        Integer x1 = new Integer(100);
        Integer x2= new Integer(10);
        Integer y = new Integer(20);

        Integer z = new Integer(50);
        numeros.addInteger(x1);
        numeros.addInteger(x2);
        numeros.addInteger(y);
        numeros.addInteger(z);

        System.out.println(numeros.toString());

        numeros.sortBigger();

        System.out.println(numeros.toString());

        numeros.sortInverso();

        System.out.println(numeros.toString());





        }


    }
