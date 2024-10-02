import Classes.*;

/* Se quiere automatizar un horno de pan. Se quieren producir diferentes tipos de pan. Es
decir que cada tipo de pan puede ser diferente según lo siguiente:
● Pan blanco: Está hecho de harina que contiene solo la parte central del grano, lo
que representa el 75% del grano entero.
● Pan integral: Está hecho de grano de trigo entero, conserva todos sus componentes.
● Pan negro: Se confecciona con la harina de la que se ha quitado salvado y germen
de trigo. Representa el 85% del grano de trigo entero.
El proceso de producción del PAN es siempre el mismo y se realizan los siguientes
pasos:
a. Comprobar la temperatura.
b. Preparar agua con sal.
c. Preparar la levadura.
d. Añadir el agua y mezclar.
e. Añadir la harina y remover.
f. Amasar.
g. Dejar reposar.
h. Cortar la masa.
i. Llevar al horno.*/
public class Main {
    public static void main(String[] args) {

        HornoDePan horno=new HornoDePan();
        PanNegroBuilder pNB= new PanNegroBuilder();
        PanBlancoBuilder pBlancoB= new PanBlancoBuilder();
        PanIntegralBuilder pIntegral =new PanIntegralBuilder();

        horno.makePan(pBlancoB);
        PanBlanco pBlanco = pBlancoB.getPanBlanco();

        }
    }
