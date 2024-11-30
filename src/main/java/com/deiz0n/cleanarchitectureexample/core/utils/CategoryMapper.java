package com.deiz0n.cleanarchitectureexample.core.utils;

import com.deiz0n.cleanarchitectureexample.core.dtos.CategoryDTO;
import com.deiz0n.cleanarchitectureexample.core.entities.CategoryEntity;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {

    public static CategoryDTO toDTO(CategoryEntity entity) {
        return CategoryDTO.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .build();
    }

    public static CategoryEntity toEntity(CategoryDTO dto) {
        return CategoryEntity.builder()
                .id(dto.id())
                .nome(dto.nome())
                .build();
    }

}
