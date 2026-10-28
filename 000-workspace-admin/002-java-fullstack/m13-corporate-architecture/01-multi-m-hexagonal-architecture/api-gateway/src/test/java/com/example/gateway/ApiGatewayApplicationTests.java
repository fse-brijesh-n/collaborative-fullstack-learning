package com.example.gateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

/**
 * Smoke test: proves the API Gateway's Spring context (routes, Eureka client,
 * actuator) wires up cleanly with the discovery client disabled, since no Eureka
 * server is running during the build/test phase.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = {
        "eureka.client.enabled=false",
        "spring.cloud.discovery.enabled=false"
})
class ApiGatewayApplicationTests {

    @Test
    void contextLoads() {
        // Intentionally empty: a failing context (e.g. bad route config) fails the build.
    }
}
