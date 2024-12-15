package Homework10;

@FunctionalInterface
public interface MathOperation<T> {
    T operate(T x, T y);
}
