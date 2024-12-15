package Homework6;

public class PayOperation {
    private String transactionId;
    private double amount;

    public PayOperation(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }
}
