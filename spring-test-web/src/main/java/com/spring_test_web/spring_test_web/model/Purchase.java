package com.spring_test_web.spring_test_web.model;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Purchase {
  private String itemName;
  private double price;
  private int quantity;

  private LocalDateTime purchaseDate;
  private String buyer;
}
