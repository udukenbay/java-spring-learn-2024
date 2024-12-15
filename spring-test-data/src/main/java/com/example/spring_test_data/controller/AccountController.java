package com.example.spring_test_data.controller;

import com.example.spring_test_data.entity.Account;
import com.example.spring_test_data.model.AccountType;
import com.example.spring_test_data.service.AccountService;
import java.math.BigDecimal;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounts")
@RequiredArgsConstructor
public class AccountController {

  private final AccountService accountService;

  @GetMapping("/{amount}")
  public ResponseEntity<List<Account>> getAccountsByBalanceGreaterThan(@PathVariable BigDecimal amount) {
    return ResponseEntity.ok(accountService.getAccountsByBalanceGreaterThan(amount));
  }

  @GetMapping
  public ResponseEntity<List<Account>> getByAccountType(@RequestBody AccountType accountType) {
    return ResponseEntity.ok(accountService.getByAccountType(accountType));
  }

  @PostMapping("/{customerId}/open")
  public ResponseEntity<Account> openAccount(@PathVariable Long customerId, @RequestBody Account account) {
    return ResponseEntity.ok(accountService.openAccount(customerId, account));
  }

  @PostMapping("/transfer")
  public ResponseEntity<Void> transfer(@RequestParam Long fromAccountId, @RequestParam Long toAccountId, @RequestParam
      BigDecimal amount) {
    accountService.transferMoney(fromAccountId, toAccountId, amount);
    return ResponseEntity.ok().build();
  }

  @PostMapping("/{accountId}/deposit")
  public ResponseEntity<Void> deposit(@PathVariable Long accountId, @RequestParam BigDecimal amount) {
    accountService.deposit(accountId, amount);
    return ResponseEntity.ok().build();
  }

  @PostMapping("/{accountId}/withdraw")
  public ResponseEntity<Void> withdraw(@PathVariable Long accountId, @RequestParam BigDecimal amount) {
    accountService.withdraw(accountId, amount);
    return ResponseEntity.ok().build();
  }
}
