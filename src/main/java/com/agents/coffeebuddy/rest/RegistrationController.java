package com.agents.coffeebuddy.rest;

import com.agents.coffeebuddy.db.BuddyRepository;
import com.agents.coffeebuddy.service.CoffeeDateService;
import com.agents.coffeebuddy.service.RegistrationService;
import com.agents.coffeebuddy.service.RegistrationStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequiredArgsConstructor
@RequestMapping("register")
public class RegistrationController {

    final RegistrationService registrationService;
    final BuddyRepository buddyRepository;
    final CoffeeDateService coffeeDateService;

    @PostMapping("new")
    RegistrationStatus registerBuddy(final @RequestBody RegistrationRequest request) {
        return registrationService.registerNewBuddy(request);
    }

    @GetMapping("count")
    int countRegisteredBuddies() {
        return (int) buddyRepository.count();
    }

    @GetMapping("schedule")
    CoffeeDateSchedule scheduleCoffeeDate() {
        return coffeeDateService.createCoffeeDateSchedule(null);
    }
}
