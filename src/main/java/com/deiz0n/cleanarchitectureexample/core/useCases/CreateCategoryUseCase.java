package com.deiz0n.cleanarchitectureexample.core.useCases;

import com.deiz0n.cleanarchitectureexample.core.dtos.CategoryDTO;

public interface CreateCategoryUseCase {

    CategoryDTO process(CategoryDTO request);

}
