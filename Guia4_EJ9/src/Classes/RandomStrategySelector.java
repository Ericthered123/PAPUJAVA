package Classes;

import java.util.Random;

public class RandomStrategySelector{




    private static final AttackStrategy[] ATTACK_STRATEGIES = {
            new PunchAttack(),
            new KickAttack(),
            new ElectricShockAttack(),
            new FlameThrowerAttack(),
            new HammerAttack(),
            new LaserAttack(),
            new MissileAttack(),

    };
    private static final DefenseStrategy[] DEFENSE_STRATEGIES = {
            new ShieldDefense(),
            new ArmorDefense(),
            new BonusDefense(),
            new AbsorbDefense(),
            new CounterDefense()
    };
    private static final Random RANDOM = new Random();
    public  static AttackStrategy getRandomAttackStrategy(){
        return getAttackStrategies()[RANDOM.nextInt((getAttackStrategies().length))];
    }
    public static DefenseStrategy getRandomDefenseStrategy(){
        return getDefenseStrategies()[RANDOM.nextInt((getDefenseStrategies().length))];
    }

    public static AttackStrategy[] getAttackStrategies(){
        return ATTACK_STRATEGIES;
    }

    public static DefenseStrategy[] getDefenseStrategies(){
        return DEFENSE_STRATEGIES;
    }





}