package test_spring_service.test_spring_service.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import test_spring_service.test_spring_service.services.ConversionService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ConversationController {

  @Autowired
  private ConversionService conversionService;

  @GetMapping("/deposit")
  public double calculateDeposit(@RequestParam("amount") double amount) {
    return conversionService.calculateDepositAmount(amount);
  }
}
