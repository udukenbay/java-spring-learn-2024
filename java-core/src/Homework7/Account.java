package Homework7;

public class Account<T> {
    private String id;
    private T balance;

    public Account(String id, T balance)
    {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public T getBalance() {
        return balance;
    }

    public void setBalance(T balance) {
        this.balance = balance;
    }
}
