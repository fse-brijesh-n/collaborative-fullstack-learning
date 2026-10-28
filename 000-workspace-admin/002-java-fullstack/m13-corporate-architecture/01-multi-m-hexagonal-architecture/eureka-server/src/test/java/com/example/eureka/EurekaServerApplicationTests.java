package com.example.eureka;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Smoke test: proves the Eureka discovery server's Spring context wires up cleanly
 * (self-registration disabled in application.yml, so no external dependency needed).
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EurekaServerApplicationTests {

    @Test
    void contextLoads() {
        // Intentionally empty: a failing context (e.g. missing bean, bad config) fails the build.
    }
}
