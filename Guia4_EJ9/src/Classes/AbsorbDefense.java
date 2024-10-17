package Classes;

public class AbsorbDefense implements DefenseStrategy {

    public AbsorbDefense() {
    }

    @Override
    public int defend(int attack) {
        return 60;
    }
}
