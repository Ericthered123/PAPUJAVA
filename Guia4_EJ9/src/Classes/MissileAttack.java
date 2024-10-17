package Classes;

public class MissileAttack implements AttackStrategy{

    public MissileAttack() {
    }

    @Override
    public int attack() {
        return 120;
    }
}
