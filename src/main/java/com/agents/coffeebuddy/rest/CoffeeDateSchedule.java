package com.agents.coffeebuddy.rest;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class CoffeeDateSchedule {

    List<CoffeeDate> schedule;

    @Value
    @Builder
    public static class CoffeeDate {
        CoffeeBuddy buddyLeft;
        CoffeeBuddy buddyRight;
    }

    @Value
    @Builder
    public static class CoffeeBuddy {
        String name;
        String email;
    }
}
