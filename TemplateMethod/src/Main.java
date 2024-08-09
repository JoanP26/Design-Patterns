import AbstractClass.AbstractClassifier;
import Classes.SatelliteClassifier;
import Classes.SpamClassifier;

public class Main {
    public static void main(String[] args) {
        System.out.println("Applying Satellite Classifier:");
        AbstractClassifier satelliteClassifier = new SatelliteClassifier();
        satelliteClassifier.classify();

        System.out.println("Applying Spam Classifier:");
        AbstractClassifier spamClassifier = new SpamClassifier();
        spamClassifier.classify();
    }
}