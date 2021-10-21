package com.example.service;

import com.example.dao.CategoryDAOImpl;
import com.example.dao.ProductDAOImpl;
import com.example.dto.CategoryDTO;
import com.example.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {

    private CategoryDTO categoryDTO = new CategoryDTO();
    private CategoryDAOImpl categoryDAO = new CategoryDAOImpl();

    public Category findCategoryById(int categoryId) {
        return categoryDTO.categoryDTO(categoryDAO.findById(Category.class, categoryId));
    }

    public List<Category> findAllCategory() {

        List<Category> listOfCategory = categoryDAO.findAll(Category.class);
        List<Category> listOfCategoryDTO = new ArrayList<>();
        for (Category category : listOfCategory) {
            listOfCategoryDTO.add(categoryDTO.categoryDTO(category));
        }
        return listOfCategoryDTO;

    }

}
