package Classes;

public class SofaModerno extends Mueble implements Sofa{


    public SofaModerno( int legs, String material) {
        super("Moderno", legs, material);
    }

    public SofaModerno() {
        super("Moderno");
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
