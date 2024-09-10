package com.example.spring_test_data.service;

import com.example.spring_test_data.entity.Customer;
import com.example.spring_test_data.repository.CustomerRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

  private final CustomerRepository customerRepository;

  public Customer registerCustomer(Customer customer) {
    return customerRepository.save(customer);
  }

  public List<Customer> searchCustomers(String name) {
    return customerRepository.findByFirstNameContainingOrLastNameContaining(name, name);
  }
}
