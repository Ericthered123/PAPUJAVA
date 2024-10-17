package Classes;

public class ElectricShockAttack implements AttackStrategy{
    public ElectricShockAttack() {
    }

    @Override
    public int attack() {
        return 110;
    }
}
