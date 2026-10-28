package com.example.documentservice.config;

import com.example.common.security.JwtAuthenticationFilter;
import com.example.common.security.JwtUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Set;

/**
 * Validates the JWT issued by auth-service on every /api/documents/** request. This service
 * does not issue tokens itself, only verifies them - it shares the same signing secret as
 * auth-service (see security.jwt.secret / the JWT_SECRET env var in docker-compose.yml).
 * See docs/10-authentication-and-tokens.md for the end-to-end flow.
 */
@Configuration
public class SecurityFilterConfig {

    @Value("${security.jwt.secret}")
    private String jwtSecret;

    @Bean
    public JwtUtil jwtUtil() {
        return new JwtUtil(jwtSecret, 0L);
    }

    @Bean
    public FilterRegistrationBean<JwtAuthenticationFilter> jwtAuthenticationFilter(JwtUtil jwtUtil) {
        var filter = new JwtAuthenticationFilter(jwtUtil, Set.of("/actuator", "/h2-console"));
        var registration = new FilterRegistrationBean<>(filter);
        registration.addUrlPatterns("/*");
        registration.setOrder(1);
        return registration;
    }
}
