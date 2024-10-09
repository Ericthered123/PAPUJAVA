package Classes;

import java.util.Objects;

public class Calc {

    public Calc(){

    }


    public int dividir(int a , int b){
        try {
            return a / b;
        }catch (ArithmeticException e){
            System.out.println("Error: Division por cero");
            return 0;
        }
    }

}
