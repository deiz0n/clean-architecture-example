package com.deiz0n.cleanarchitectureexample.adapters;

import com.deiz0n.cleanarchitectureexample.core.dtos.CategoryDTO;
import com.deiz0n.cleanarchitectureexample.core.useCases.GetAllCategoriesUseCase;
import com.deiz0n.cleanarchitectureexample.core.utils.CategoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllCategoriesUseCaseImpl implements GetAllCategoriesUseCase {

    private final CategoryRepositoryService categoryRepository;

    public GetAllCategoriesUseCaseImpl(CategoryRepositoryService categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDTO> process() {
        return categoryRepository.getAll()
                .stream()
                .map(CategoryMapper::toDTO)
                .toList();
    }

}
