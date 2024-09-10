package com.example.spring_test_data.repository;

import com.example.spring_test_data.entity.Transaction;
import com.example.spring_test_data.model.TransactionType;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
  List<Transaction> findByTimestampBetween(LocalDateTime start, LocalDateTime end);
  List<Transaction> findByTransactionTypeAndAmount(TransactionType transactionType, BigDecimal amount);
}
