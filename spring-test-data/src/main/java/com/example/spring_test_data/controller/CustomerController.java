package com.example.spring_test_data.controller;

import com.example.spring_test_data.entity.Customer;
import com.example.spring_test_data.service.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerController {

  private final CustomerService customerService;

  @GetMapping
  public ResponseEntity<List<Customer>> getAllCustomers() {
    return ResponseEntity.ok(customerService.getCustomers());
  }

  @GetMapping("/search/email/{email}")
  public ResponseEntity<Optional<Customer>> getCustomerByEmail(@PathVariable String email) {
    return ResponseEntity.ok(customerService.getCustomerByEmail(email));
  }

  @PostMapping("/register")
  public ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer) {
    return ResponseEntity.ok(customerService.registerCustomer(customer));
  }

  @PostMapping("/{name}")
  @Operation(summary = "search customer by name")
  public ResponseEntity<List<Customer>> searchCustomers(@PathVariable String name) {
    return ResponseEntity.ok(customerService.searchCustomers(name));
  }
}
