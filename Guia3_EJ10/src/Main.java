
/*Modifique el Ejercicio 3 para que ahora la interface FiguraGeometrica implemente
el default method imprimir(). El cual debe imprimir el nombre + color + área de la
figura.
NOTA: Es probable que tenga que modificar / refactorizar su clases*/


import Classes.*;

public class Main {
    public static void main(String[] args) {

        GraphEditor gg = new GraphEditor();

        FiguraGeometrica figura= new Circulo("Rojo",3);
        FiguraGeometrica figura2 = new Triangulo("Verde",10,2);


        figura.imprimir();
        figura2.imprimir();

        }
    }
