package com.agents.coffeebuddy.service;

import com.agents.coffeebuddy.rest.CoffeeDateSchedule;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("coffee-date")
@RequiredArgsConstructor
public class CoffeeDateController {

    final CoffeeDateService coffeeDateService;

    @PostMapping("schedule/$date")
    CoffeeDateSchedule createCoffeeDateSchedule(final @PathVariable String date) {
        return coffeeDateService.createCoffeeDateSchedule(date);
    }
}
