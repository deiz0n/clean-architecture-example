package com.deiz0n.cleanarchitectureexample.infrastructure;

import com.deiz0n.cleanarchitectureexample.core.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepositoryJPA extends JpaRepository<CategoryEntity, UUID> {
}
