package BehaviourDesignPattern.Iterartor;

public interface Aggregate<T> {
    Iterartor<T> createIterator();

}
