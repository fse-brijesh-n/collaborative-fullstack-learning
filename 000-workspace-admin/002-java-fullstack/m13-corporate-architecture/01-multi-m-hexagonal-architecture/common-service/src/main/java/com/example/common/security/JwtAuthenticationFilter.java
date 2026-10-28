package com.example.common.security;

import com.example.common.constants.AppConstants;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Set;

/**
 * Shared inbound token-validation filter used by every business service (auth-service,
 * batch-processing-service, document-service, logging-service) to enforce
 * "Authorization: Bearer &lt;jwt&gt;" on protected endpoints.
 *
 * <p>This is intentionally a plain {@link Filter}, not a Spring Security filter chain -
 * it keeps each service's dependency footprint small (no spring-security-web needed) while
 * still giving every service the same authentication behavior, since all services share
 * the same signing secret (see {@code security.jwt.secret} in each service's
 * application.yml / the {@code JWT_SECRET} environment variable in docker-compose.yml).
 *
 * <p>On success, it exposes the authenticated username/role as request attributes
 * ({@code authUsername}, {@code authRole}) that controllers can read if needed.
 */
public class JwtAuthenticationFilter implements Filter {

    private final JwtUtil jwtUtil;
    private final Set<String> publicPathPrefixes;

    public JwtAuthenticationFilter(JwtUtil jwtUtil, Set<String> publicPathPrefixes) {
        this.jwtUtil = jwtUtil;
        this.publicPathPrefixes = publicPathPrefixes;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        String path = httpRequest.getRequestURI();

        if (isPublic(path)) {
            chain.doFilter(request, response);
            return;
        }

        String header = httpRequest.getHeader(AppConstants.AUTH_HEADER);
        if (header == null || !header.startsWith(AppConstants.BEARER_PREFIX)) {
            httpResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Missing Authorization: Bearer <token> header");
            return;
        }

        String token = header.substring(AppConstants.BEARER_PREFIX.length());
        try {
            String username = jwtUtil.extractSubject(token);
            String role = jwtUtil.extractRole(token);
            httpRequest.setAttribute("authUsername", username);
            httpRequest.setAttribute("authRole", role);
        } catch (Exception ex) {
            // Covers expired tokens (ExpiredJwtException), bad signature, malformed token, etc.
            // jjwt's parser validates both signature and expiration during parsing.
            httpResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid or expired token");
            return;
        }

        chain.doFilter(request, response);
    }

    private boolean isPublic(String path) {
        return publicPathPrefixes.stream().anyMatch(path::startsWith);
    }
}
