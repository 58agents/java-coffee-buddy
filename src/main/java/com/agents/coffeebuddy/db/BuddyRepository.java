package com.agents.coffeebuddy.db;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BuddyRepository extends CrudRepository<BuddyEntity, Long> {

    Optional<BuddyEntity> findByEmail(String email);
}
