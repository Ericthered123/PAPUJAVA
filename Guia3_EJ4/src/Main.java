
import Classes.*;

public class Main {

    public static void main(String[] args){

        Hablador doggy = new Perro("Wolfy", "Boxer");
        Hablador p = new Persona();
        Hablador c= new Cucu();

        TalkAdmin.main(args);
        TalkAdmin.hacerHablar(doggy);  //Al ser metodos estaticos estos se pueden invocar sin necesidad de crear una
        TalkAdmin.hacerHablar(p);                               //una instancia de esa clase
        TalkAdmin.hacerHablar(c);



    }

}
