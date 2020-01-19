package com.test.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.models.Category;
import com.test.repositories.CategoryRepository;
import com.test.services.CategoryService;

@Component
public class CategoriesServiceImpl implements CategoryService {

	@Autowired public CategoryRepository categoriesRepository;
	
	public Category getCategory(Integer id) {
		return categoriesRepository.getOne(id);
	}
}
