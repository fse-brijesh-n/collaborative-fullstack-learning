package com.example.documentservice;

import com.example.common.dto.ApiResponse;
import com.example.common.security.JwtUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.nio.charset.StandardCharsets;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * End-to-end test proving document-service enforces the shared JWT filter and that a
 * real multipart upload/list/download round-trip works against the real H2 database.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = {
        "eureka.client.enabled=false",
        "spring.cloud.discovery.enabled=false"
})
class DocumentServiceApplicationTests {

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
    void listDocumentsWithoutTokenIsRejected() {
        ResponseEntity<String> response = restTemplate.getForEntity(url("/api/documents"), String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.UNAUTHORIZED);
    }

    @Test
    void uploadListAndDownloadRoundTripWithValidToken() {
        HttpHeaders uploadHeaders = authHeaders();
        uploadHeaders.setContentType(MediaType.MULTIPART_FORM_DATA);

        MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        body.add("file", new ByteArrayResource("hello world".getBytes(StandardCharsets.UTF_8)) {
            @Override
            public String getFilename() {
                return "notes.txt";
            }
        });

        ResponseEntity<ApiResponse> uploadResponse = restTemplate.exchange(
                url("/api/documents"), HttpMethod.POST, new HttpEntity<>(body, uploadHeaders), ApiResponse.class);

        assertThat(uploadResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(uploadResponse.getBody()).isNotNull();
        Map<?, ?> uploaded = (Map<?, ?>) uploadResponse.getBody().getData();
        assertThat(uploaded.get("fileName")).isEqualTo("notes.txt");
        Number id = (Number) uploaded.get("id");

        ResponseEntity<ApiResponse> listResponse = restTemplate.exchange(
                url("/api/documents"), HttpMethod.GET, new HttpEntity<>(authHeaders()), ApiResponse.class);
        assertThat(listResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat((java.util.List<?>) listResponse.getBody().getData()).isNotEmpty();

        ResponseEntity<byte[]> downloadResponse = restTemplate.exchange(
                url("/api/documents/" + id), HttpMethod.GET, new HttpEntity<>(authHeaders()), byte[].class);
        assertThat(downloadResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(new String(downloadResponse.getBody(), StandardCharsets.UTF_8)).isEqualTo("hello world");
    }

    @Test
    void downloadingUnknownDocumentReturnsNotFound() {
        ResponseEntity<String> response = restTemplate.exchange(
                url("/api/documents/999999"), HttpMethod.GET, new HttpEntity<>(authHeaders()), String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }
}
