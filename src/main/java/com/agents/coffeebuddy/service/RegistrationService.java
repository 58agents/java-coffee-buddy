package com.agents.coffeebuddy.service;

import com.agents.coffeebuddy.db.BuddyEntity;
import com.agents.coffeebuddy.db.BuddyRepository;
import com.agents.coffeebuddy.rest.RegistrationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistrationService {

    private final BuddyRepository buddyRepository;

    public RegistrationStatus registerNewBuddy(final RegistrationRequest request) {
        final boolean existing = buddyRepository.findByEmail(request.getEmail()).isPresent();
        if (existing) {
            return RegistrationStatus.builder()
                    .message("Email already in use")
                    .result(RegistrationStatus.Result.ALREADY_EXISTS)
                    .build();
        }
        final var buddy = BuddyEntity.builder()
                                .name(request.getName())
                                .email(request.getEmail())
                                .build();
        try {
            buddyRepository.save(buddy);
        } catch (Throwable t) {
            return RegistrationStatus.builder()
                    .message("Technical error during registration")
                    .result(RegistrationStatus.Result.ERROR)
                    .build();
        }
        return RegistrationStatus.builder()
                .message("Email already in use")
                .result(RegistrationStatus.Result.SUCCESS)
                .build();
    }
}
