package Classes;

public class FabricaVictoriana implements FabricaMuebles{

    public FabricaVictoriana(){};

    @Override
    public Silla createChair(int legs, String material) {
        return new SillaVicto(legs,material);
    }

    @Override
    public Mesita createMesita(int legs, String material) {
        return new MesitaVicto(legs, material);
    }

    @Override
    public Sofa createSofa(int legs, String material) {
        return new SofaVicto(legs, material);
    }


}
