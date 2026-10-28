package com.example.authservice.config;

import com.example.common.security.JwtAuthenticationFilter;
import com.example.common.security.JwtUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

/**
 * Wires framework beans that the hexagonal core depends on (ports are interfaces;
 * this class only supplies infrastructure-level building blocks such as password
 * hashing and JWT signing, not the ports themselves - those are wired by
 * @Service/@Component annotations on the adapters).
 */
@Configuration
public class BeanConfig {

    @Value("${security.jwt.secret}")
    private String jwtSecret;

    @Value("${security.jwt.expiration-ms}")
    private long jwtExpirationMs;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public JwtUtil jwtUtil() {
        return new JwtUtil(jwtSecret, jwtExpirationMs);
    }

    /**
     * Registers the shared JWT filter (see common-service) so any future protected endpoint
     * in auth-service (beyond register/login, which must stay public) is enforced the same
     * way as the other business services. See docs/10-authentication-and-tokens.md.
     */
    @Bean
    public FilterRegistrationBean<JwtAuthenticationFilter> jwtAuthenticationFilter(JwtUtil jwtUtil) {
        var filter = new JwtAuthenticationFilter(jwtUtil, Set.of(
                "/api/auth/register",
                "/api/auth/login",
                "/actuator",
                "/h2-console"));
        var registration = new FilterRegistrationBean<>(filter);
        registration.addUrlPatterns("/*");
        registration.setOrder(1);
        return registration;
    }
}
