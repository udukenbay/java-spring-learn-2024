package Homework7;

public interface Transactionable<T> {
    String getId();
    T getSourceAccount();
    T getTargetAccount();
    double getAmount();

    void deposit(double amount);
    void withdraw(double amount);
}
