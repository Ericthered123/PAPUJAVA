package Classes;

public class CounterDefense implements DefenseStrategy {

    public CounterDefense() {
    }

    @Override
    public int defend(int attack) {
        return 50;
    }
}
