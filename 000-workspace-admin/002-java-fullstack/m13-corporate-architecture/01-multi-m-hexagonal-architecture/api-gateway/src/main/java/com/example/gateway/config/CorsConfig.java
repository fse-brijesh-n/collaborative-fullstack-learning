package com.example.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.List;

/**
 * Allows the static frontend (served from its own origin, e.g. http://localhost:3000)
 * to call this gateway directly from the browser with fetch()/XHR. Declared explicitly
 * as a {@link CorsWebFilter} bean (rather than the spring.cloud.gateway.globalcors.*
 * properties) because it is applied first in the reactive filter chain, before routing,
 * and is easy to unit-test in isolation. See docs/12-frontend.md and
 * docs/10-authentication-and-tokens.md for how the frontend uses this.
 */
@Configuration
public class CorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter() {
        CorsConfiguration configuration = new CorsConfiguration();
        // Demo/learning project: any origin may call the gateway. Lock this down to a
        // specific origin allow-list before using this pattern in a real production system.
        configuration.setAllowedOriginPatterns(List.of("*"));
        configuration.setAllowedMethods(List.of("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
        configuration.setAllowedHeaders(List.of("*"));
        configuration.setAllowCredentials(false);
        configuration.setMaxAge(3600L);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);

        return new CorsWebFilter(source);
    }
}
