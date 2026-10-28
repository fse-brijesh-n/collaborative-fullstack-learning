package com.example.common.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Unit tests for the shared servlet filter using mocked request/response/chain -
 * exercises the exact logic every business service relies on to protect its
 * /api/** endpoints (see docs/10-authentication-and-tokens.md).
 */
class JwtAuthenticationFilterTest {

    private static final String SECRET = "learning-project-demo-secret-key-change-me";

    private JwtUtil jwtUtil;
    private JwtAuthenticationFilter filter;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private FilterChain chain;

    @BeforeEach
    void setUp() {
        jwtUtil = new JwtUtil(SECRET, 60_000);
        filter = new JwtAuthenticationFilter(jwtUtil, Set.of("/actuator", "/h2-console"));
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        chain = mock(FilterChain.class);
    }

    @Test
    void allowsPublicPathWithoutToken() throws Exception {
        when(request.getRequestURI()).thenReturn("/actuator/health");

        filter.doFilter(request, response, chain);

        verify(chain).doFilter(request, response);
        verify(response, never()).sendError(anyInt(), anyString());
    }

    @Test
    void rejectsProtectedPathWithoutAuthorizationHeader() throws Exception {
        when(request.getRequestURI()).thenReturn("/api/logs");
        when(request.getHeader("Authorization")).thenReturn(null);

        filter.doFilter(request, response, chain);

        verify(response).sendError(eq(HttpServletResponse.SC_UNAUTHORIZED), anyString());
        verify(chain, never()).doFilter(request, response);
    }

    @Test
    void rejectsProtectedPathWithMalformedToken() throws Exception {
        when(request.getRequestURI()).thenReturn("/api/logs");
        when(request.getHeader("Authorization")).thenReturn("Bearer not-a-valid-jwt");

        filter.doFilter(request, response, chain);

        verify(response).sendError(eq(HttpServletResponse.SC_UNAUTHORIZED), anyString());
        verify(chain, never()).doFilter(request, response);
    }

    @Test
    void allowsProtectedPathWithValidToken() throws Exception {
        String token = jwtUtil.generateToken("alice", Map.of("role", "USER"));
        when(request.getRequestURI()).thenReturn("/api/logs");
        when(request.getHeader("Authorization")).thenReturn("Bearer " + token);

        filter.doFilter(request, response, chain);

        verify(chain).doFilter(request, response);
        verify(request).setAttribute("authUsername", "alice");
        verify(request).setAttribute("authRole", "USER");
        verify(response, never()).sendError(anyInt(), anyString());
    }
}
