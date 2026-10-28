package com.example.common.exception;

/**
 * Thrown by domain/application layers when a business rule is violated
 * (e.g. duplicate username, invalid credentials). Adapters translate this
 * into an HTTP 400/409 response.
 */
public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
