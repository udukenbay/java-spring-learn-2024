package com.example.spring_test_data.configuration;

import com.example.spring_test_data.configuration.properties.SecurityProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
@RequiredArgsConstructor
public class CorsSecurityConfiguration {

  private final SecurityProperties securityProperties;

  @Bean
  CorsFilter corsFilter() { return new CorsFilter(corsConfigurationSource()); }

  @Bean
  CorsConfigurationSource corsConfigurationSource() {
    var source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", defaultCorsConfiguration());
    return source;
  }

  private CorsConfiguration defaultCorsConfiguration() {
    var corsConfig = new CorsConfiguration();
    corsConfig.applyPermitDefaultValues();
    corsConfig.addAllowedMethod(CorsConfiguration.ALL);
    corsConfig.addAllowedHeader(CorsConfiguration.ALL);
    corsConfig.setAllowedOrigins(securityProperties.origins());
    corsConfig.setAllowCredentials(true);
    return corsConfig;
  }
}
