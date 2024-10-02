package Classes;

public class SillaModerna extends Mueble implements Silla{

    public SillaModerna( int legs, String material) {
        super("Moderna" ,legs, material);
    }

    public SillaModerna() {
        super("Moderna");
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
