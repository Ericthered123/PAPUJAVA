package Classes;

public class FabricaModerna implements FabricaMuebles{


    public FabricaModerna(){};

    @Override
    public Silla createChair(int legs, String material) {
        return new SillaModerna(legs, material);
    }

    @Override
    public Mesita createMesita(int legs, String material) {
        return new MesitaModerna(legs,material);
    }

    @Override
    public Sofa createSofa(int legs, String material) {
        return new SofaModerno(legs,material);
    }
}
