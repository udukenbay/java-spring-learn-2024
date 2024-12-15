package com.example.spring_test_data.service;

import com.example.spring_test_data.entity.Transaction;
import com.example.spring_test_data.model.TransactionType;
import com.example.spring_test_data.repository.TransactionRepository;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionService {
  private final TransactionRepository transactionRepository;

  public List<Transaction> getTransactionsByTimestampBetween(LocalDateTime start, LocalDateTime end) {
    return transactionRepository.findByTimestampBetween(start, end);
  }

  public List<Transaction> getTransactionsByTransactionTypeAndAmount(TransactionType transactionType,
      BigDecimal amount) {
    return transactionRepository.findByTransactionTypeAndAmount(transactionType, amount);
  }
}
