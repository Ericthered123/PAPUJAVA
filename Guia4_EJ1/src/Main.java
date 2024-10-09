/*Una fábrica de juegos de PC desea modelar un sistema de selección aleatoria de
jugadores (RandomSelector). Dado que la selección aleatoria se usa en muchos y
variados juegos (p.e: selección aleatoria de números, de cartas, de colores, de fichas,
etc.) Se detalló que el RandomSelector debería ser diseñado de tal forma que se pueda
usar con cualquier tipo de objetos.

Nota: El funcionamiento debería ser el siguiente: Una vez creado el RandomSelector
con el tipo de Objeto que va a seleccionar este permanece así. Al RandomSelector se
le pueden agregar N objetos a seleccionar. Cuando se le dice selectNext() retorna un
objeto seleccionado de manera aleatoria.
*/


import Classes.RandomSelector;

public class Main {
    public static void main(String[] args) {


        RandomSelector<Integer> selector = new RandomSelector<>();


        selector.addElement(1);
        selector.addElement(2);
        selector.addElement(3);
        selector.addElement(4);
        selector.addElement(5);
        selector.addElement(6);


        System.out.println(selector.selectNext());
    }
}