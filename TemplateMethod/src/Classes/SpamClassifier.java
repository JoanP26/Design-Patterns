package Classes;
import AbstractClass.AbstractClassifier;

public class SpamClassifier extends AbstractClassifier {
    @Override
    protected void extraction() {
        System.out.println("Extracting features for spam detection.");
    }

    @Override
    protected void implementation() {
        System.out.println("Implementing KNN algorithm for spam detection.");
    }

    @Override
    protected void evaluation() {
        System.out.println("Evaluating the spam detector classifier.");
    }

    @Override
    protected void result() {
        System.out.println("Obtaining results for spam detection.");
    }
}
