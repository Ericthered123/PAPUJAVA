package Classes;

public interface FabricaMuebles {
    
    public Silla createChair(int legs, String material);
    public Mesita createMesita(int legs, String material);
    public Sofa createSofa(int legs, String material);

    
    
}
