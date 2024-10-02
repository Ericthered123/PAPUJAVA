

import prototypeAndStrategy.*;

public class Main {
    public static void main(String[] args) {
        Circulo c1= new Circulo("Verde",0,0,1);

        Cuadrado c2= new Cuadrado("Azul",0,0,10);


        PrototypeShape c4= c1.clone();

        PrototypeShape c5= c2.clone();

        ConcreteStr1 str1 = new ConcreteStr1();
        ConcreteStr2 str2 = new ConcreteStr2();

        Context ctx= new Context(str1);

        System.out.println(ctx.executeStrategy(2,2));

        ctx.setStrategy(str2);

        System.out.println(ctx.executeStrategy(2,2));

        System.out.println(c4 + " Y "+ c1);
        System.out.println(c5 + " Y "+ c2);


        }
    }
