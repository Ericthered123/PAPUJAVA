package Classes;

public class Colectivo extends Vehiculo {




    public Colectivo(String marca,String modelo, int patente) {
       super(patente,marca,modelo) ;


    }

    public int getCantPasajeros() {
        return getPasajeros().size();
    }


}
