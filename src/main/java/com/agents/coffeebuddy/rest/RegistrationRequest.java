package com.agents.coffeebuddy.rest;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@Builder
public class RegistrationRequest {

    @NotBlank
    private final String name;
    @NotBlank
    @Email
    private final String email;
}
