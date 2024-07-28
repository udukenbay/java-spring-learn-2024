package test_spring_service.test_spring_service.services;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class StringUtilsService {

  public String capitalize(String str) {
    return StringUtils.capitalize(str);
  }

  // Другие методы StringUtils по необходимости
}
