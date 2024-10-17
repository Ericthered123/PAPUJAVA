/*Defina en Java la clase DataBag, la cual tiene un número máximo de elementos y
permite almacenar cualquier tipo de objetos.
a) Implemente en JAVA la clase DataBag.
b) Defina el método add() para permitir agregar elementos a la bolsa y en el caso de
que la misma esté llena dispare la excepción FullDataBagException.
c) Defina el método remove() para remover elementos de la bolsa y en el caso de que
la misma esté vacía se dispare la excepción EmptyDataBagException
Nota: Tenga en cuenta que las dos excepciones FullDataBagException y
EmptyDataBagException son excepciones chequeadas que deben ser creadas por
usted como subclase de Exception*/


import Classes.DataBag;
import Classes.EmptyDataBagException;
import Classes.FullDataBagException;

public class Main {
    public static void main(String[] args) {

        DataBag<Integer> bolsaNumeros= new DataBag<Integer>(3,"bolsaNumbers");




        try {
            bolsaNumeros.add(10);
            bolsaNumeros.add(20);
            bolsaNumeros.add(30);
            bolsaNumeros.add(40);
            bolsaNumeros.remove();
        }catch (FullDataBagException e){
            System.out.println(e.getMessage());
        } catch (EmptyDataBagException e) {
            System.out.println(e.getMessage());
        }






    }
}