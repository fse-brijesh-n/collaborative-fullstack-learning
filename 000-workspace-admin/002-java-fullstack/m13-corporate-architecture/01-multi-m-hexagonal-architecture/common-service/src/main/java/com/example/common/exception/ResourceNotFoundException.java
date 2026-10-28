package com.example.common.exception;

/**
 * Thrown when a requested resource (user, document, job, log entry, ...) cannot be found.
 * Adapters translate this into an HTTP 404 response.
 */
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
