package Classes;
import AbstractClass.AbstractClassifier;

public class SatelliteClassifier extends AbstractClassifier {
    @Override
    protected void extraction() {
        System.out.println("Extracting features for satellite images.");
    }

    @Override
    protected void implementation() {
        System.out.println("Implementing KNN algorithm for satellite images.");
    }

    @Override
    protected void evaluation() {
        System.out.println("Evaluating the satellite image classifier.");
    }

    @Override
    protected void result() {
        System.out.println("Obtaining results for satellite image classification.");
    }
}
