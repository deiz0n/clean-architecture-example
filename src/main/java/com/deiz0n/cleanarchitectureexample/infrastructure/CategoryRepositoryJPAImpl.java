package com.deiz0n.cleanarchitectureexample.infrastructure;

import com.deiz0n.cleanarchitectureexample.adapters.CategoryRepositoryService;
import com.deiz0n.cleanarchitectureexample.core.entities.CategoryEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepositoryJPAImpl implements CategoryRepositoryService {

    private final CategoryRepositoryJPA categoryRepositoryJPA;

    public CategoryRepositoryJPAImpl(CategoryRepositoryJPA categoryRepositoryJPA) {
        this.categoryRepositoryJPA = categoryRepositoryJPA;
    }

    @Override
    public CategoryEntity create(CategoryEntity request) {
        return categoryRepositoryJPA.save(request);
    }

    @Override
    public List<CategoryEntity> getAll() {
        return categoryRepositoryJPA.findAll();
    }

    @Override
    public boolean doesCategoryNameExist(String name) {
        return categoryRepositoryJPA.findByNome(name).isPresent();
    }
}
