package com.example.spring_test_data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String departmentName;
  private String departmentAddress;
  private String departmentCode;
}
