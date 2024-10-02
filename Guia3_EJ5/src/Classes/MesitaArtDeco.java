package Classes;

public class MesitaArtDeco extends Mueble implements Mesita{



    public MesitaArtDeco() {
        super("ArtDeco");
    }
    public MesitaArtDeco(int legs, String material) {
        super("ArtDeco", legs, material);
    }

    @Override
    public boolean hasLegs() {
        return getLegs() > 0;
    }

    @Override
    public void layOn() {

    }
}
