package Homework10;

@FunctionalInterface
public interface PredicateOperation<T, R> {
    T operate(R x);
}
