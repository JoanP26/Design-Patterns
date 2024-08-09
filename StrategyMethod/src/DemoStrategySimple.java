import Classes.Context;
import Classes.Distances.Euclidean;
import Classes.Distances.Manhattan;
import Classes.Strategies.KMeansStrategy;
import Classes.Strategies.KNNStrategy;
import Classes.Strategies.SOMStrategy;

public class DemoStrategySimple {
    public static void main(String[] args) {
        System.out.println("--- KNN with Euclidean distance---");
        Context context = new Context(new KNNStrategy(new Euclidean()));
        context.executeStrategy();
        System.out.println("--- KNN with Manhattan distance---");
        context.setClassifierStrategy(new KMeansStrategy(new Manhattan()));
        context.executeStrategy();
        System.out.println("--- K-means with Manhattan distance ---");
        context.setClassifierStrategy(new SOMStrategy(new Manhattan()));
        context.executeStrategy();
        System.out.println("--- SOM  with Euclidean distance ---");
        context.setClassifierStrategy(new SOMStrategy(new Euclidean()));
        context.executeStrategy();
    }

}
