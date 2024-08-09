package Classes.Strategies;
import Interfaces.Distance;
import Interfaces.Strategy;

public class KMeansStrategy implements Strategy {
    public Distance distance;
    public KMeansStrategy(Distance distance){
        this.distance = distance;
    }
    public void setDistance (Distance distance){
        this.distance = distance;
    }
    @Override
    public void execute() {
        distance.getDistance();
        System.out.println("Kmeans executed");
    }
}
