package com.test.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.models.Category;
import com.test.models.ProductType;
import com.test.services.CategoryService;
import com.test.services.ProductTypeService;

@Controller
@RequestMapping("/category")
public class CategoryConroller {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ProductTypeService productTypeService;

	@GetMapping
	public String newCategory(ModelMap model) {
		Category category = new Category();
		model.addAttribute("view_mode", "New");
		model.addAttribute("category", category);
		model.addAttribute("product_types", getAllProductType());
		return "category";
	}

	@PostMapping
	public String newCategory(Category category, ModelMap model) {
		Map<String, String> response = new HashMap<String, String>();
		categoryService.createCategory(category);
		response.put("status", "success");
		return "redirect:list";
	}

	@GetMapping("{id}")
	public String updateCategory(@PathVariable Integer id, ModelMap model) {
		Category category = categoryService.findCategory(id);
		if (category != null) {
			model.addAttribute("view_mode", "Update");
			model.addAttribute("id", id);
			model.addAttribute("product_types", getAllProductType());
			model.addAttribute("category", category);
			return "category";
		} else {
			return "redirect:list";
		}
	}

	@PostMapping("{id}")
	public String updateCategory(@PathVariable Integer id, Category category, ModelMap model) {
		Map<String, String> response = new HashMap<String, String>();
		categoryService.updateCategory(id, category);
		response.put("status", "success");
		return "redirect:list";
	}

	@PostMapping("/delete")
	@ResponseBody
	public Map<String, String> batchDeleteCategory(@RequestParam(value = "itemIds[]") List<Integer> categoryIds) {
		Map<String, String> response = new HashMap<String, String>();
		boolean status = categoryService.deleteCategories(categoryIds);
		System.out.println(status);
		response.put("status", status ? "success" : "failed");
		return response;
	}

	@GetMapping("/list")
	public String categoryList(ModelMap model) {
		List<ProductType> productTypes = getAllProductType();
		model.addAttribute("product_type_list", productTypes);
		model.addAttribute("product_type_names_map", productTypeService.getNameMapWithIdFromProductTypeList(productTypes));
		model.addAttribute("category_list", categoryService.findAllCategory());
		return "categories";
	}

	private List<ProductType> getAllProductType() {
		return productTypeService.findAllProductType();
	}
}
