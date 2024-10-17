package Classes;

public class EvadeDefense implements DefenseStrategy {

    public EvadeDefense() {
    }

    @Override
    public int defend(int attack) {
        return 40;
    }
}
