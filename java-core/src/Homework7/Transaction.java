package Homework7;

import com.sun.tools.javac.Main;
import java.util.logging.Level;
import java.util.logging.Logger;

// Создайте обобщенный класс Transaction<T>, представляющий транзакцию с банковским счетом
// Класс Transaction<T> должен содержать поля (with String id, <T> sourceAccount, <T> targetAccount, double amount) и реализовывать интерфейс Transactionable
// Реализуйте конструктор, принимающий значения для всех полей
// Создайте метод processTransaction(), который будет выполнять транзакцию между счетами
public class Transaction<T extends Account> implements Transactionable<T> {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    private String id;
    private T sourceAccount;
    private T targetAccount;
    private double amount;

    public Transaction(String id, T sourceAccount, T targetAccount, double amount) {
        this.id = id;
        this.sourceAccount = sourceAccount;
        this.targetAccount = targetAccount;
        this.amount = amount;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public T getSourceAccount() {
        return sourceAccount;
    }

    @Override
    public T getTargetAccount() {
        return targetAccount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    public void processTransaction() {
        System.out.println("выполнение транзакции между счетами");
        if (sourceAccount instanceof Account && targetAccount instanceof Account) {
            Account<Double> source = (Account<Double>) sourceAccount;
            Account<Double> target = (Account<Double>) targetAccount;

            if (source.getBalance() >= amount) {
                source.setBalance(source.getBalance() - amount);
                target.setBalance(target.getBalance() + amount);
                logger.log(Level.INFO, "Transaction processed successfully.");
            } else {
                logger.log(Level.SEVERE, "Insufficient funds in the source account.");
            }
        } else {
            logger.log(Level.SEVERE, "Invalid account types for transaction.");
        }
    }

    @Override
    public void deposit(double amount) {
        logger.log(Level.INFO, "Depositing " + amount + " units");
    }

    @Override
    public void withdraw(double amount) {
        logger.log(Level.INFO, "Withdrawing " + amount + " units");
    }
}
