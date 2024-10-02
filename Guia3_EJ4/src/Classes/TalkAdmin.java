package Classes;/*Dada una clase abstracta denominada Animal de la cual derivan las clases Gato y
Perro. Ambas clases redefinen el método habla declarada abstracta en la clase Animal
como se muestra a continuación:
public abstract class Animal {
public abstract void habla();
}
public class Perro extends Animal{
public void habla(){
System.out.println("¡Guau!");
}
}
public class Gato extends Animal{
public void habla(){
System.out.println("¡Miau!");
}
}
Se desea hacer una clase llamada Classes.TalkAdmin que posee animales y a cada uno de ellos
“los hace” hablar.
public class Classes.TalkAdmin {
public static void main(String[] args) {
Gato gato=new Gato();
hacerHablar(gato);
Perro perro =new Perro();
hacerHablar(perro);
}
public static void hacerHablar(Animal sujeto){
sujeto.habla();
}
}*/

public class TalkAdmin {
    public static void main(String[] args) {
        Hablador gato = new Gato("Eric","Hershire");
        gato.habla();
        Hablador perro = new Perro("Facu", "Bulldog");
        perro.habla();

        }

    public static void hacerHablar(Hablador sujeto){
        sujeto.habla();

    }
    }
