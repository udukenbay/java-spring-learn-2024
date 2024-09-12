package com.example.spring_test_data.repository;

import com.example.spring_test_data.entity.Customer;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

  Optional<Customer> findByEmail(String email);

  List<Customer> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);
}
