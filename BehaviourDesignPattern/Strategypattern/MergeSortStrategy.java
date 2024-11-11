package BehaviourDesignPattern.Strategypattern;

// BehaviourDesignPattern.Strategypattern.MergeSortStrategy
public class MergeSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        // Implement Merge Sort algorithm
        System.out.println("Sorting using Merge Sort");
    }
}
