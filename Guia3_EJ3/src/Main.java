
import Classes.*;

public class Main {
    public static void main(String[] args) {

        GraphEditor editor = new GraphEditor();

        FiguraGeometrica rectangulo = new Rectangulo("Azul",2,5);
        FiguraGeometrica cuadrado = new Cuadrado("Rojo",10);
        FiguraGeometrica circulo = new Circulo("Negro",3);
        FiguraGeometrica triangulo = new Triangulo("Blanco",10,2);

        editor.addFiguraGeometrica(rectangulo);
        editor.addFiguraGeometrica(cuadrado);
        editor.addFiguraGeometrica(circulo);
        editor.addFiguraGeometrica(triangulo);

        System.out.println("Area total de las figuras: " + editor.areaTotal());
        System.out.println(circulo.getOrigen());

        System.out.println("Moviendo figuras... ");
        editor.moverFiguras(1,Direccion.NORTE);
        System.out.println(circulo.getOrigen());



        }
    }
