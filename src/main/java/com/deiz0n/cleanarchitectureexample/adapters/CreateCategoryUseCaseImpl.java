package com.deiz0n.cleanarchitectureexample.adapters;

import com.deiz0n.cleanarchitectureexample.core.dtos.CategoryDTO;
import com.deiz0n.cleanarchitectureexample.core.entities.CategoryEntity;
import com.deiz0n.cleanarchitectureexample.core.exceptions.CategoryAlreadyExistException;
import com.deiz0n.cleanarchitectureexample.core.useCases.CreateCategoryUseCase;
import com.deiz0n.cleanarchitectureexample.core.utils.CategoryMapper;

public class CreateCategoryUseCaseImpl implements CreateCategoryUseCase {

    private final CategoryRepositoryService categoryRepository;

    public CreateCategoryUseCaseImpl(CategoryRepositoryService categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryDTO process(CategoryDTO request) {
        if (categoryRepository.doesCategoryNameExist(request.nome()))
            throw new CategoryAlreadyExistException("Category already registered");

        CategoryEntity category = CategoryMapper.toEntity(request);

        categoryRepository.create(category);

        return request;
    }
}
