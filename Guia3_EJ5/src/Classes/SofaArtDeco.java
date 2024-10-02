package Classes;

public class SofaArtDeco extends Mueble implements Sofa {


    public SofaArtDeco( int legs, String material) {
        super("ArtDeco", legs, material);
    }

    public SofaArtDeco() {
        super("ArtDeco");
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
