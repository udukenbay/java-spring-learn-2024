package com.example.spring_test_data.service;

import com.example.spring_test_data.entity.Account;
import com.example.spring_test_data.entity.Customer;
import com.example.spring_test_data.model.AccountType;
import com.example.spring_test_data.repository.AccountRepository;
import com.example.spring_test_data.repository.CustomerRepository;
import java.math.BigDecimal;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

  private final AccountRepository accountRepository;
  private final CustomerRepository customerRepository;

  public List<Account> getAccountsByBalanceGreaterThan(BigDecimal amount) {
    return accountRepository.findByBalanceGreaterThan(amount);
  }

  public List<Account> getByAccountType(AccountType accountType) {
    return accountRepository.findByAccountType(accountType);
  }

  public Account openAccount(Long customerId, Account account) {
    Customer customer = customerRepository.findById(customerId).orElseThrow();
    account.setCustomer(customer);
    return accountRepository.save(account);
  }

  public void transferMoney(Long fromAccountId, Long toAccountId, BigDecimal amount) {
    Account fromAccount = accountRepository.findById(fromAccountId).orElseThrow();
    Account toAccount = accountRepository.findById(toAccountId).orElseThrow();

    fromAccount.setBalance(fromAccount.getBalance().subtract(amount));
    toAccount.setBalance(toAccount.getBalance().add(amount));

    accountRepository.save(fromAccount);
    accountRepository.save(toAccount);
  }

  public void deposit(Long accountId, BigDecimal amount) {
    Account account = accountRepository.findById(accountId).orElseThrow();
    account.setBalance(account.getBalance().add(amount));
    accountRepository.save(account);
  }

  public void withdraw(Long accountId, BigDecimal amount) {
    Account account = accountRepository.findById(accountId).orElseThrow();
    account.setBalance(account.getBalance().subtract(amount));
    accountRepository.save(account);
  }
}
