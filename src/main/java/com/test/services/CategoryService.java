package com.test.services;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.test.models.Category;

@Service
public interface CategoryService {

	public Category createCategory(Category category);

	public Category updateCategory(Integer id, Category category);

	public boolean deleteCategories(List<Integer> categoryIds);

	public String getCategoryName(Integer id);

	public List<String> getAllCategoryName();

	public List<String> getAllCategoryNameByProductTypeId(Integer productTypeId);

	public Category findCategory(Integer id);

	public List<Category> findAllCategory();

	public List<Category> findAllCategoryByProductTypeId(Integer productTypeId);

	public Map<Integer, String> getNameMapWithIdFromCategoryList(List<Category> Categories);
}
