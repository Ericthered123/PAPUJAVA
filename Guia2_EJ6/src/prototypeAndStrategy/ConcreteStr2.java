package prototypeAndStrategy;

public class ConcreteStr2 implements Strategy{

    public ConcreteStr2(){}

    @Override
    public double execute(double a, double b) {
        return a+b;
    }
}
