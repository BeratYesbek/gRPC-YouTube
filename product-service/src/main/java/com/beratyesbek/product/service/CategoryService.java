package com.beratyesbek.product.service;

import com.beratyesbek.product.model.Category;
import com.beratyesbek.product.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repository;

    public Category add(Category category) {
        return repository.save(category);
    }
}
