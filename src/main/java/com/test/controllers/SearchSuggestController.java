package com.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.models.Category;
import com.test.services.CategoryService;

@Controller
@RequestMapping("/searchsuggest")
public class SearchSuggestController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/categories")
	@ResponseBody
	public List<Category> getCategoriesByProductTypeId(@RequestParam Integer productTypeId) {
		return categoryService.findAllCategoryByProductTypeId(productTypeId);
	}
}
