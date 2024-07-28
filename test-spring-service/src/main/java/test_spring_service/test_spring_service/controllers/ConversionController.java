package test_spring_service.test_spring_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import test_spring_service.test_spring_service.services.ConversionService;

@RestController
@RequestMapping("/api")
public class ConversionController {

  @Autowired
  private ConversionService conversionService;

  @GetMapping("/deposit")
  public double calculateDeposit(@RequestParam("amount") double amount) {
    return conversionService.calculateDepositAmount(amount);
  }
}
