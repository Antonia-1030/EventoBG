package com.myapp.services;

import com.myapp.models.Category;
import com.myapp.repo.CategoryRepo;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private final CategoryRepo repository;

    public CategoryService(CategoryRepo repository) {
        this.repository = repository;
    }

    public Optional<Category> get(Long id) {
        return repository.findById(id);
    }

    public Category update(Category entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Category> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Category> list(Pageable pageable, Specification<Category> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }
}
