package com.example.common.security;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtException;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Pure unit tests for the shared JWT helper - no Spring context required.
 * Covers the two things every service in this project relies on: auth-service
 * issuing tokens, and every other service validating them with the same secret.
 */
class JwtUtilTest {

    private static final String SECRET = "learning-project-demo-secret-key-change-me";

    @Test
    void generatesTokenAndExtractsSubjectAndRole() {
        JwtUtil jwtUtil = new JwtUtil(SECRET, 60_000);

        String token = jwtUtil.generateToken("alice", Map.of("role", "USER"));

        assertThat(token).isNotBlank();
        assertThat(jwtUtil.extractSubject(token)).isEqualTo("alice");
        assertThat(jwtUtil.extractRole(token)).isEqualTo("USER");
        assertThat(jwtUtil.isExpired(token)).isFalse();
        assertThat(jwtUtil.isTokenValid(token, "alice")).isTrue();
    }

    @Test
    void isTokenValidReturnsFalseForWrongSubject() {
        JwtUtil jwtUtil = new JwtUtil(SECRET, 60_000);

        String token = jwtUtil.generateToken("alice", Map.of("role", "USER"));

        assertThat(jwtUtil.isTokenValid(token, "bob")).isFalse();
    }

    @Test
    void expiredTokenFailsValidation() throws InterruptedException {
        JwtUtil jwtUtil = new JwtUtil(SECRET, 1);

        String token = jwtUtil.generateToken("alice", Map.of("role", "USER"));
        Thread.sleep(20);

        assertThatThrownBy(() -> jwtUtil.extractSubject(token))
                .isInstanceOf(ExpiredJwtException.class);
    }

    @Test
    void tokenSignedWithDifferentSecretIsRejected() {
        JwtUtil issuer = new JwtUtil(SECRET, 60_000);
        JwtUtil validator = new JwtUtil("a-completely-different-secret-key-value", 60_000);

        String token = issuer.generateToken("alice", Map.of("role", "USER"));

        assertThatThrownBy(() -> validator.extractSubject(token))
                .isInstanceOf(JwtException.class);
    }

    @Test
    void shortSecretIsPaddedRatherThanRejected() {
        // Secrets shorter than 32 bytes must still work (JwtUtil pads them) since
        // docker-compose.yml's default demo secret and short overrides both need to work.
        JwtUtil jwtUtil = new JwtUtil("short-secret", 60_000);

        String token = jwtUtil.generateToken("alice", Map.of("role", "ADMIN"));

        assertThat(jwtUtil.extractSubject(token)).isEqualTo("alice");
        assertThat(jwtUtil.extractRole(token)).isEqualTo("ADMIN");
    }
}
