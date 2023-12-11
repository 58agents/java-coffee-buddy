package com.agents.coffeebuddy.service;

import lombok.Builder;

@Builder
public record RegistrationStatus(String message, RegistrationStatus.Result result) {

    enum Result {
        SUCCESS,
        ERROR,
        ALREADY_EXISTS
    }
}
