package com.example.spring_test_data.controller;

import com.example.spring_test_data.entity.Transaction;
import com.example.spring_test_data.model.TransactionType;
import com.example.spring_test_data.service.TransactionService;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transactions")
@RequiredArgsConstructor
public class TransactionController {

  private final TransactionService transactionService;

  @GetMapping("/times/{start}/{end}")
  public ResponseEntity<List<Transaction>> getTransactionsByTimestampBetween(
      @PathVariable LocalDateTime start, @PathVariable LocalDateTime end) {
    return ResponseEntity.ok(transactionService.getTransactionsByTimestampBetween(start, end));
  }

  @GetMapping("/types/{transactionType}/amount/{amount}")
  public ResponseEntity<List<Transaction>> getTransactionsByTransactionTypeAndAmount(
      @PathVariable TransactionType transactionType,
      @PathVariable BigDecimal amount) {
    return ResponseEntity.ok(
        transactionService.getTransactionsByTransactionTypeAndAmount(transactionType, amount));
  }
}
