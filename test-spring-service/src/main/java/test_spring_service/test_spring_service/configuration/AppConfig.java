package test_spring_service.test_spring_service.configuration;

import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  public Map<String, Double> exchangeRate() {
    Map<String, Double> params = new HashMap<>();
    params.put("dollarRate", 75.0); // Пример курса доллара
    params.put("depositRate", 5.0); // Пример базовой ставки по депозиту
    return params;
  }
}
