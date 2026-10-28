package com.example.authservice.domain.port.in;

/**
 * Inbound port (use case) - what the outside world can ask the domain to do.
 * Implemented by application/service, invoked by adapter/in/web.
 */
public interface RegisterUserUseCase {

    User register(RegisterCommand command);

    record RegisterCommand(String username, String rawPassword) {
    }

    record User(Long id, String username, String role) {
    }
}
