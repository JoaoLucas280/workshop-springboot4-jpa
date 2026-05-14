package com.projeto.spring_boot.services;

import com.projeto.spring_boot.entities.Category;
import com.projeto.spring_boot.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
    public Category findById(Long id) {
        Optional<Category> Category = categoryRepository.findById(id);
        return Category.get();
    }
}
