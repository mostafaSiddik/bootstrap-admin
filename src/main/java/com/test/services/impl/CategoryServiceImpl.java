package com.test.services.impl;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.models.Category;
import com.test.repositories.CategoryRepository;
import com.test.services.CategoryService;

@Component
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	public CategoryRepository categoryRepository;

	@Override
	public Category createCategory(Category category) {
		category.setCreated_by(0000);
		category.setCreated_date(getCurrentDate());
		category.setIs_deleted(false);

		return categoryRepository.save(category);
	}

	@Override
	public Category updateCategory(Integer id, Category category) {
		Category ctg = findCategory(id);

		ctg.setProduct_type_id(category.getProduct_type_id());
		ctg.setName(category.getName());
		ctg.setCode(category.getCode());
		ctg.setDescription(category.getDescription());
		ctg.setModified_by(0000);
		ctg.setModified_date(getCurrentDate());
		ctg.setIs_deleted(false);

		return categoryRepository.save(ctg);
	}

	@Override
	public boolean deleteCategories(List<Integer> categoryIds) {
		try {
			categoryIds.stream().forEach(id -> {
				Category category = findCategory(id);

				category.setModified_by(0000);
				category.setModified_date(getCurrentDate());
				category.setIs_deleted(true);

				categoryRepository.save(category);
			});
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public String getCategoryName(Integer id) {
		return categoryRepository.getCategoryName(id);
	}

	@Override
	public List<String> getAllCategoryName() {
		return categoryRepository.getCategoryNames();
	}

	@Override
	public List<String> getAllCategoryNameByProductTypeId(Integer productTypeId) {
		return categoryRepository.getCategoryNamesByProductTypeId(productTypeId);
	}

	@Override
	public Category findCategory(Integer id) {
		Optional<Category> category = categoryRepository.findById(id);
		return category.isPresent() ? category.get() : null;
	}

	@Override
	public List<Category> findAllCategory() {
		return categoryRepository.findAll().stream().filter(category -> !category.isIs_deleted())
				.sorted(Comparator.comparing(Category::getName)).collect(Collectors.toList());
	}

	@Override
	public List<Category> findAllCategoryByProductTypeId(Integer productTypeId) {
		return categoryRepository.getAllCategoryByProductTypeId(productTypeId).stream()
				.sorted(Comparator.comparing(Category::getName)).collect(Collectors.toList());
	}

	@Override
	public Map<Integer, String> getNameMapWithIdFromCategoryList(List<Category> Categories) {
		return Categories.stream().collect(Collectors.toMap(Category::getId, Category::getName));
	}

	private Date getCurrentDate() {
		return new Date();
	}

}
