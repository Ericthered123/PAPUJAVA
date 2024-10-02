package Classes;

public class SillaVicto extends Mueble implements Silla{


    public SillaVicto( int legs, String material) {
        super("Victoriana", legs, material);
    }

    public SillaVicto() {
        super("Victoriana");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting");
    }

    @Override
    public void standinUp() {
        System.out.println("StandinUp");
    }

    @Override
    public boolean hasLegs() {
        return getLegs()>0;
    }
}
