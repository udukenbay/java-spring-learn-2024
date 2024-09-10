package com.example.spring_test_data.controller;

import com.example.spring_test_data.entity.Account;
import com.example.spring_test_data.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounts")
@RequiredArgsConstructor
public class AccountController {

  private final AccountService accountService;

  @PostMapping("/{customerId}/open")
  public ResponseEntity<Account> openAccount(@PathVariable Long customerId, @RequestBody Account account) {
    return ResponseEntity.ok(accountService.openAccount(customerId, account));
  }
}
