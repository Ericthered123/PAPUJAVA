package Classes;

public class MesitaVicto extends Mueble implements Mesita{

    public MesitaVicto() {
        super("Victoriana");
    }
    public MesitaVicto(int legs, String material) {
        super("Victoriana", legs, material);

    }

    @Override
    public boolean hasLegs() {
        return getLegs() > 0;
    }

    @Override
    public void layOn() {

    }
}
