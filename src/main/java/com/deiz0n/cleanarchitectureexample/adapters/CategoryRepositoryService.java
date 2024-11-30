package com.deiz0n.cleanarchitectureexample.adapters;

import com.deiz0n.cleanarchitectureexample.core.dtos.CategoryDTO;
import com.deiz0n.cleanarchitectureexample.core.entities.CategoryEntity;

import java.util.List;

public interface CategoryRepositoryService {

    CategoryEntity create(CategoryEntity request);
    List<CategoryEntity> getAll();
    boolean doesCategoryNameExist(String name);

}
