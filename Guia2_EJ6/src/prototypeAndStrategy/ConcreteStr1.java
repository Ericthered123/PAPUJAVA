package prototypeAndStrategy;

public class ConcreteStr1 implements Strategy{

    public ConcreteStr1(){}

    @Override
    public double execute(double a, double b) {
        return a-b;
    }
}
