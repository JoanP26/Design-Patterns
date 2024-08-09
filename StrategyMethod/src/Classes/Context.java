package Classes;
import Interfaces.Strategy;

public class Context {
    private Interfaces.Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setClassifierStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        if (strategy != null) {
            strategy.execute();
        } else {
            System.out.println("No hay estrategia establecida");
        }
    }
}
