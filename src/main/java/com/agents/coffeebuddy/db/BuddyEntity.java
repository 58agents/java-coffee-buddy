package com.agents.coffeebuddy.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@AllArgsConstructor
@Table(name = "buddies")
public class BuddyEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
}
