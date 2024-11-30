package com.deiz0n.cleanarchitectureexample.core.dtos;

import lombok.Builder;

import java.util.UUID;

@Builder
public record CategoryDTO(UUID id, String nome) {
}
