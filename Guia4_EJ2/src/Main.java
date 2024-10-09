/*Implementar una clase genérica llamada Par que represente un par de elementos, donde
cada elemento puede ser de un tipo diferente. La clase debe tener métodos para obtener
el primer y segundo elemento del par, así como un método para imprimir la información
del par.

Además, crea una aplicación que utilice la clase Par para instanciar pares con diferentes
tipos de datos, como Integer y String, y muestre la información de cada par.  */


import Classes.Par;

public class Main {
    public static void main(String[] args) {

        Par par1= new Par(42,"Hola Mundo");

        par1.showPar();




    }
}