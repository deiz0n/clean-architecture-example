package com.deiz0n.cleanarchitectureexample.adapters.controllers;

import com.deiz0n.cleanarchitectureexample.adapters.CreateCategoryUseCaseImpl;
import com.deiz0n.cleanarchitectureexample.adapters.GetAllCategoriesUseCaseImpl;
import com.deiz0n.cleanarchitectureexample.core.dtos.CategoryDTO;
import com.deiz0n.cleanarchitectureexample.core.exceptions.CategoryAlreadyExistException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryControllerImpl implements CategoryController {

    private final CreateCategoryUseCaseImpl createCategory;
    private final GetAllCategoriesUseCaseImpl getAllCategories;

    public CategoryControllerImpl(CreateCategoryUseCaseImpl createCategory, GetAllCategoriesUseCaseImpl getAllCategories) {
        this.createCategory = createCategory;
        this.getAllCategories = getAllCategories;
    }

    @Override
    public ResponseEntity<?> create(CategoryDTO request) {
        try {
            CategoryDTO category = createCategory.process(request);

            URI uri = ServletUriComponentsBuilder
                    .fromCurrentRequest()
                    .path("{id}")
                    .buildAndExpand(category.id())
                    .toUri();

            return ResponseEntity.created(uri).body(category);
        } catch (CategoryAlreadyExistException e) {
            return ResponseEntity.badRequest().body("Category already registered");
        }
    }

    @Override
    public ResponseEntity<List<CategoryDTO>> getAll() {
        List<CategoryDTO> categories = getAllCategories.process();

        return ResponseEntity.ok(categories);
    }
}
