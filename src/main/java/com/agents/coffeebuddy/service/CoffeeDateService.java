package com.agents.coffeebuddy.service;

import com.agents.coffeebuddy.db.BuddyRepository;
import com.agents.coffeebuddy.rest.CoffeeDateSchedule;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CoffeeDateService {

    private final BuddyRepository buddyRepository;

    public CoffeeDateSchedule createCoffeeDateSchedule(final String date) {
        return CoffeeDateSchedule.builder().build();
    }
}
