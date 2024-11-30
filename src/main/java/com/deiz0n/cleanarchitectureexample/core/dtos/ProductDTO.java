package com.deiz0n.cleanarchitectureexample.core.dtos;

import java.util.UUID;

public record ProductDTO(UUID id, String name, Double price, String description) {
}
