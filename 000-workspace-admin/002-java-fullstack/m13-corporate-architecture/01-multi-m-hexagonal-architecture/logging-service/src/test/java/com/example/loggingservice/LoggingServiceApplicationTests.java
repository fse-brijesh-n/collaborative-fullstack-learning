package com.example.loggingservice;

import com.example.common.dto.ApiResponse;
import com.example.common.security.JwtUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * End-to-end test for logging-service: the exact scenario that first surfaced the
 * -parameters compiler-flag bug (see docs/09-troubleshooting.md) and the flow
 * documented in docs/10-authentication-and-tokens.md.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = {
        "eureka.client.enabled=false",
        "spring.cloud.discovery.enabled=false"
})
class LoggingServiceApplicationTests {

    private static final String SECRET = "learning-project-demo-secret-key-change-me";

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private String url(String path) {
        return "http://localhost:" + port + path;
    }

    private HttpHeaders authHeaders() {
        JwtUtil jwtUtil = new JwtUtil(SECRET, 60_000);
        String token = jwtUtil.generateToken("alice", Map.of("role", "USER"));
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);
        return headers;
    }

    @Test
    void getLogsWithoutTokenIsRejected() {
        ResponseEntity<String> response = restTemplate.getForEntity(url("/api/logs"), String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.UNAUTHORIZED);
    }

    @Test
    void postAndQueryLogWithValidToken() {
        Map<String, String> body = Map.of(
                "sourceService", "auth-service",
                "level", "INFO",
                "message", "integration test log");

        ResponseEntity<ApiResponse> postResponse = restTemplate.exchange(
                url("/api/logs"), HttpMethod.POST, new HttpEntity<>(body, authHeaders()), ApiResponse.class);

        assertThat(postResponse.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        assertThat(postResponse.getBody()).isNotNull();
        assertThat(postResponse.getBody().isSuccess()).isTrue();

        ResponseEntity<ApiResponse> getResponse = restTemplate.exchange(
                url("/api/logs?sourceService=auth-service"),
                HttpMethod.GET,
                new HttpEntity<>(authHeaders()),
                ApiResponse.class);

        assertThat(getResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
        List<?> logs = (List<?>) getResponse.getBody().getData();
        assertThat(logs).isNotEmpty();
    }

    @Test
    void postLogRejectsMissingFields() {
        Map<String, String> invalidBody = Map.of("sourceService", "", "level", "INFO", "message", "");

        ResponseEntity<String> response = restTemplate.exchange(
                url("/api/logs"), HttpMethod.POST, new HttpEntity<>(invalidBody, authHeaders()), String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
    }
}
