package com.example.authservice;

import com.example.common.dto.ApiResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * End-to-end test for the whole auth-service: real embedded Tomcat, real H2 database,
 * real JWT filter - proves the register/login flow documented in
 * docs/10-authentication-and-tokens.md actually works, not just that the classes compile.
 *
 * Eureka client registration is disabled for the test since no discovery server is
 * running in the CI/build environment.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = {
        "eureka.client.enabled=false",
        "spring.cloud.discovery.enabled=false"
})
class AuthServiceApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private String url(String path) {
        return "http://localhost:" + port + path;
    }

    @Test
    void registerThenLoginReturnsUsableToken() {
        Map<String, String> registerBody = Map.of("username", "carol", "password", "secret123");
        ResponseEntity<ApiResponse> registerResponse =
                restTemplate.postForEntity(url("/api/auth/register"), registerBody, ApiResponse.class);

        assertThat(registerResponse.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        assertThat(registerResponse.getBody()).isNotNull();
        assertThat(registerResponse.getBody().isSuccess()).isTrue();

        Map<String, String> loginBody = Map.of("username", "carol", "password", "secret123");
        ResponseEntity<ApiResponse> loginResponse =
                restTemplate.postForEntity(url("/api/auth/login"), loginBody, ApiResponse.class);

        assertThat(loginResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(loginResponse.getBody()).isNotNull();
        Map<?, ?> data = (Map<?, ?>) loginResponse.getBody().getData();
        assertThat(data.get("token")).isNotNull();
        assertThat(data.get("username")).isEqualTo("carol");
        assertThat(data.get("role")).isEqualTo("USER");
    }

    @Test
    void registeringSameUsernameTwiceFails() {
        Map<String, String> body = Map.of("username", "dave", "password", "secret123");
        restTemplate.postForEntity(url("/api/auth/register"), body, ApiResponse.class);

        ResponseEntity<Map> secondAttempt =
                restTemplate.postForEntity(url("/api/auth/register"), body, Map.class);

        assertThat(secondAttempt.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
    }

    @Test
    void loginWithWrongPasswordFails() {
        Map<String, String> body = Map.of("username", "erin", "password", "correct-password");
        restTemplate.postForEntity(url("/api/auth/register"), body, ApiResponse.class);

        Map<String, String> badLogin = Map.of("username", "erin", "password", "wrong-password");
        ResponseEntity<Map> loginResponse = restTemplate.postForEntity(url("/api/auth/login"), badLogin, Map.class);

        assertThat(loginResponse.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
    }

    @Test
    void registerRejectsShortPassword() {
        Map<String, String> body = Map.of("username", "frank", "password", "abc");
        ResponseEntity<Map> response = restTemplate.postForEntity(url("/api/auth/register"), body, Map.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
    }
}
