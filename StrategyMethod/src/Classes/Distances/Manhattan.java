package Classes.Distances;
import Interfaces.Distance;
import Interfaces.Strategy;

public class Manhattan implements Distance {
    @Override
    public void getDistance(){
        System.out.println("Manhattan  computed");
    }
}

