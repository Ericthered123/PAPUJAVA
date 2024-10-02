package prototypeAndStrategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public Context(){}

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public Strategy getStrategy() {
        return strategy;
    }

//El contexto le delega el trabajo de implementar los distintos algoritmos al strategy, asi
//no se satura el codigo en una sola clase
    public double executeStrategy(double a, double b){
        return getStrategy().execute(a,b);

    }


}
