package com.deiz0n.cleanarchitectureexample.core.useCases;

import com.deiz0n.cleanarchitectureexample.core.dtos.CategoryDTO;

import java.util.List;

public interface GetAllCategoriesUseCase {

    List<CategoryDTO> process();

}
