package Classes;

public class FabricaArtDeco implements FabricaMuebles{


    public FabricaArtDeco(){};

    @Override
    public Silla createChair(int legs, String material) {
        return new SillaArtDeco(legs, material);
    }

    @Override
    public Mesita createMesita(int legs, String material) {
        return new MesitaArtDeco(legs, material);
    }

    @Override
    public Sofa createSofa(int legs, String material) {
        return new SofaArtDeco(legs, material);
    }
}
