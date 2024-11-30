package com.deiz0n.cleanarchitectureexample.adapters.controllers;

import com.deiz0n.cleanarchitectureexample.core.dtos.CategoryDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface CategoryController {

    @PostMapping("/create")
    @Transactional
    ResponseEntity<?> create(CategoryDTO request);

    @GetMapping
    @Transactional
    ResponseEntity<List<CategoryDTO>> getAll();

}
