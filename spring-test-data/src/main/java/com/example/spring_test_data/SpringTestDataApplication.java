package com.example.spring_test_data;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
@OpenAPIDefinition(
		info = @io.swagger.v3.oas.annotations.info.Info(
				title = "My First Test API app",
				version = "0.0.1",
				description = "Spring Test Data App REST API"
		)
)
@SecurityScheme(
		name = "bearerAuth",
		type = SecuritySchemeType.HTTP,
		bearerFormat = "JWT",
		scheme = "bearer"
)
public class SpringTestDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestDataApplication.class, args);
	}

}
