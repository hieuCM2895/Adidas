package com.example.dto;

import com.example.model.Category;

public class CategoryDTO {

    public Category categoryDTO(Category category) {

        Category categoryDTO = new Category();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());

        return categoryDTO;

    }
}
