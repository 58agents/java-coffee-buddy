package com.agents.coffeebuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.agents.coffeebuddy")
public class CoffeeBuddyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeBuddyApplication.class, args);
	}

}
