package com.deiz0n.cleanarchitectureexample.adapters;

import com.deiz0n.cleanarchitectureexample.core.dtos.CategoryDTO;

import java.util.List;

public interface CategoryRepositoryService {

    CategoryDTO create(CategoryDTO request);
    List<CategoryDTO> getAll();
    boolean doesCategoryNameExist(String name);

}
