package com.example.authservice.adapter.in.web;

import com.example.authservice.domain.port.in.LoginUseCase;
import com.example.authservice.domain.port.in.RegisterUserUseCase;
import com.example.common.dto.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Inbound (driving) adapter: translates HTTP requests into use-case calls
 * and use-case results back into HTTP responses.
 */
@RestController
public class AuthController {

    private final RegisterUserUseCase registerUserUseCase;
    private final LoginUseCase loginUseCase;

    public AuthController(RegisterUserUseCase registerUserUseCase, LoginUseCase loginUseCase) {
        this.registerUserUseCase = registerUserUseCase;
        this.loginUseCase = loginUseCase;
    }

    @PostMapping("/api/auth/register")
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse<RegisterUserUseCase.User> register(@Valid @RequestBody RegisterRequest request) {
        var result = registerUserUseCase.register(
                new RegisterUserUseCase.RegisterCommand(request.getUsername(), request.getPassword()));
        return ApiResponse.ok("User registered successfully", result);
    }

    @PostMapping("/api/auth/login")
    public ApiResponse<LoginUseCase.LoginResult> login(@Valid @RequestBody LoginRequest request) {
        var result = loginUseCase.login(
                new LoginUseCase.LoginCommand(request.getUsername(), request.getPassword()));
        return ApiResponse.ok("Login successful", result);
    }
}
