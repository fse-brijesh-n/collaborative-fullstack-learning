package com.example.authservice.domain.port.in;

/**
 * Inbound port (use case) for authenticating a user and issuing a JWT.
 */
public interface LoginUseCase {

    LoginResult login(LoginCommand command);

    record LoginCommand(String username, String rawPassword) {
    }

    record LoginResult(String token, String username, String role) {
    }
}
