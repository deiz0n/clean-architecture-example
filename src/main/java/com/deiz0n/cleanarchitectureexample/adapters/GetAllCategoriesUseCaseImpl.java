package com.deiz0n.cleanarchitectureexample.adapters;

import com.deiz0n.cleanarchitectureexample.core.dtos.CategoryDTO;
import com.deiz0n.cleanarchitectureexample.core.useCases.GetAllCategoriesUseCase;

import java.util.List;

public class GetAllCategoriesUseCaseImpl implements GetAllCategoriesUseCase {

    private CategoryRepositoryService categoryRepository;

    @Override
    public List<CategoryDTO> process() {
        return categoryRepository.getAll();
    }

}
