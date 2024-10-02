import Classes.Chofer;
import Classes.Colectivo;
import Classes.Pasajero;

public class Main {
    public static void main(String[] args) {

        Colectivo colectivo1= new Colectivo("Kamaz", "T2000",123);
        Colectivo colectivo2= new Colectivo("Mercedes", "Benz",321);


        Chofer enrique= new Chofer("Enrique",colectivo2);
        Chofer carlos= new Chofer("Carlos",colectivo1);
        Pasajero eric= new Pasajero("Eric",20);
        Pasajero p2= new Pasajero("Gonzalo",18);
        Pasajero p3= new Pasajero("Pedro",19);

        colectivo2.addPasajero(p2);
        colectivo2.addPasajero(p3);
        colectivo1.addPasajero(eric);
        carlos.viajar(100);
        enrique.viajar(300);

        System.out.println(p2.millas()+ p3.millas());
        //TODO Hacerlo solo a traves de la interfaz


        }
    }
