package Classes;

public class SillaArtDeco extends Mueble implements Silla{


    public SillaArtDeco( int legs, String material) {
        super("ArtDeco" ,legs, material);
    }

    public SillaArtDeco() {
        super("ArtDeco");
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
