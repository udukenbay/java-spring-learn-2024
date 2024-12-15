package com.example.spring_test_data.configuration.properties;

import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app.security")
public record SecurityProperties(
    List<String> origins
) {

}
