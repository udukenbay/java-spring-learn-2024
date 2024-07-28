package Homework9;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BankAccount {
    private double balance;
    Logger logger = Logger.getLogger(com.sun.tools.javac.Main.class.getName());

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        logger.log(Level.INFO,"Deposited: " + amount);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            logger.log(Level.INFO,"Withdrawn: " + amount);
        } else {
            logger.log(Level.SEVERE, "Insufficient funds for withdrawal");
        }
    }
}
