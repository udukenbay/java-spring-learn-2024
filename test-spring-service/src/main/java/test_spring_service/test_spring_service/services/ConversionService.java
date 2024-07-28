package test_spring_service.test_spring_service.services;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConversionService {

  @Autowired
  private Map<String, Double> exchangeRates;

  // Метод для вычислинения суммы депозита
  public double calculateDepositAmount(double initialAmount) {
    double rate = exchangeRates.get("depositRate") / 100;
    return initialAmount * (1 + rate);
  }

  // Метод для конвертации валюты
  public double convert(String fromCurrency, String toCurrency, double amount) {
    // Проверка на существование валют
    if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
      throw new IllegalArgumentException("Unsupported currency");
    }

    // Конвертация в доллары
    double amountInUSD = amount / exchangeRates.get(fromCurrency);

    // Конвертация из долларов в целевую валюту
    return amountInUSD * exchangeRates.get(toCurrency);
  }
}
