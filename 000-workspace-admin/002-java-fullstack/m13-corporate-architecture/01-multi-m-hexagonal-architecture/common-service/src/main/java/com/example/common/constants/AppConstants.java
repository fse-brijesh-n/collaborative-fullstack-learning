package com.example.common.constants;

/**
 * Constants shared across microservices (HTTP header names, default values, etc.).
 */
public final class AppConstants {

    private AppConstants() {
    }

    public static final String AUTH_HEADER = "Authorization";
    public static final String BEARER_PREFIX = "Bearer ";
    public static final String CLAIM_ROLE = "role";
}
