package Classes;

public class MesitaModerna extends Mueble implements Mesita{



    public MesitaModerna() {
        super("Moderna");
    }
    public MesitaModerna( int legs, String material) {
        super("Moderna", legs, material);

    }



    @Override
    public boolean hasLegs() {
        return getLegs() > 0;
    }

    @Override
    public void layOn() {

    }
}
