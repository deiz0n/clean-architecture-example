package com.deiz0n.cleanarchitectureexample.adapters;

import com.deiz0n.cleanarchitectureexample.core.dtos.CategoryDTO;
import com.deiz0n.cleanarchitectureexample.core.exceptions.CategoryAlreadyExistException;
import com.deiz0n.cleanarchitectureexample.core.useCases.CreateCategoryUseCase;

public class CreateCategoryUseCaseImpl implements CreateCategoryUseCase {

    private CategoryRepositoryService categoryRepository;

    @Override
    public CategoryDTO process(CategoryDTO request) {
        if (categoryRepository.doesCategoryNameExist(request.nome()))
            throw new CategoryAlreadyExistException("Category already registered");

        categoryRepository.create(request);

        return request;
    }
}
