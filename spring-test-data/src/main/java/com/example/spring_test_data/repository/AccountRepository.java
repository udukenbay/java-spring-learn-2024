package com.example.spring_test_data.repository;

import com.example.spring_test_data.entity.Account;
import com.example.spring_test_data.model.AccountType;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

  List<Account> findByBalanceGreaterThan(BigDecimal amount);

  List<Account> findByAccountType(AccountType accountType);
}
