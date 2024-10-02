package Classes;

public class SofaVicto extends Mueble implements Sofa{

    public SofaVicto( int legs, String material) {
        super("Victoriano", legs, material);
    }

    public SofaVicto() {
        super("Victoriano");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting");
    }

    @Override
    public void standinUp() {
        System.out.println("Standin Up");

    }

    @Override
    public boolean hasLegs() {
        return getLegs()>0;
    }
}
