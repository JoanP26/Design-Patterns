package Classes.Strategies;
import Interfaces.Distance;
import Interfaces.Strategy;

public class KNNStrategy implements Strategy {
    public Distance distance;
    public KNNStrategy(Distance distance){
        this.distance = distance;
    }
    public void setDistance (Distance distance){
        this.distance = distance;
    }
    @Override
    public void execute() {
        distance.getDistance();
        System.out.println("Knn executed");
    }
}
