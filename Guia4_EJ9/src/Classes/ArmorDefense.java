package Classes;

public class ArmorDefense implements DefenseStrategy {

    public ArmorDefense() {
    }

    @Override
    public int defend(int attack) {
        return 50;
    }
}
