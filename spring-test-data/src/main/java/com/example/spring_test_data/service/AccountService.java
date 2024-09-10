package com.example.spring_test_data.service;

import com.example.spring_test_data.entity.Account;
import com.example.spring_test_data.entity.Customer;
import com.example.spring_test_data.repository.AccountRepository;
import com.example.spring_test_data.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

  private final AccountRepository accountRepository;
  private final CustomerRepository customerRepository;

  public Account openAccount(Long customerId, Account account) {
    Customer customer = customerRepository.findById(customerId).orElseThrow();
    account.setCustomer(customer);
    return accountRepository.save(account);
  }
}
