package Classes;

public interface BattleStrategy {
    default String getStrategyName() {
        return getClass().getSimpleName();
    }
}
