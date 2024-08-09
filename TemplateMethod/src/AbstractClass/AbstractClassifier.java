package AbstractClass;

public abstract class AbstractClassifier {
    // Métodos comunes
    public void classify() {
        lookAtData();
        calculateDistances();
        findNeighbors();
        voteOnLabels();
        extraction();
        implementation();
        evaluation();
        result();
    }

    private void lookAtData() {
        System.out.println("Looking at the data.");
    }

    private void calculateDistances() {
        System.out.println("Calculating distances.");
    }

    private void findNeighbors() {
        System.out.println("Finding neighbors.");
    }

    private void voteOnLabels() {
        System.out.println("Voting on labels.");
    }

    // Métodos abstractos que deben ser implementados por subclases
    protected abstract void extraction();

    protected abstract void implementation();

    protected abstract void evaluation();

    protected abstract void result();
}
