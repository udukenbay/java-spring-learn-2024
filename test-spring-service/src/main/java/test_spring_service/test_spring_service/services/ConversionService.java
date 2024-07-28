package test_spring_service.test_spring_service.services;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConversionService {

  @Autowired
  private Map<String, Double> appParameters;

  public double calculateDepositAmount(double initialAmount) {
    double rate = appParameters.get("depositRate") / 100;
    return initialAmount * (1 + rate);
  }

  // Метод для конвертации валюты, используя курс доллара
  // ...
}
