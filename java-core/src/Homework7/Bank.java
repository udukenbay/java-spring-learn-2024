package Homework7;

import java.util.ArrayList;
import java.util.List;

// Создайте класс Bank<T>, который будет представлять банк и хранить список счетов (тип T)
// Реализуйте методы для добавления нового счета, выполнения транзакций и получения информации о балансе счета
public class Bank<T extends Double> {
    private List<Account<T>> accountBalances;

    public Bank() {
        this.accountBalances = new ArrayList<>();
    }

    public void addNewAccountBalance(Account<T> account) {
        accountBalances.add(account);
    }

    public void executeTransaction(Transaction<Account<T>> transaction) {
        transaction.processTransaction();
    }

    public List<Account<T>> getInfoAboutAccountBalances() {
        return accountBalances;
    }
}
