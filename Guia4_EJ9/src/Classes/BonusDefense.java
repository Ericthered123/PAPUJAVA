package Classes;

public class BonusDefense implements DefenseStrategy {
    public BonusDefense() {
    }

    @Override
    public int defend(int attack) {
        return attack;
    }
}
