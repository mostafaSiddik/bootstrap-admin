package com.test.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.models.Product;
import com.test.models.ProductType;
import com.test.services.CategoryService;
import com.test.services.ProductService;
import com.test.services.ProductTypeService;

@Controller
@RequestMapping("/product")
public class ProductConroller {

	@Autowired
	private ProductService productService;
	@Autowired
	private ProductTypeService productTypeService;
	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public String newProduct(ModelMap model) {
		Product product = new Product();
		model.addAttribute("view_mode", "New");
		model.addAttribute("product_types", getAllProductType());
		model.addAttribute("product", product);
		return "product";
	}

	@PostMapping
	public String newProduct(@Validated Product product, ModelMap model) {
		Map<String, String> response = new HashMap<String, String>();
		productService.createProduct(product);
		response.put("status", "success");
		return "redirect:list";
	}

	@GetMapping("{id}")
	public String updateProduct(@PathVariable Integer id, ModelMap model) {
		model.addAttribute("view_mode", "Update");
		model.addAttribute("id", id);
		model.addAttribute("product_types", getAllProductType());
		model.addAttribute("product", productService.findProduct(id));
		return "product";
	}

	@PostMapping("{id}")
	public String updateProduct(@PathVariable Integer id, @Validated Product product, ModelMap model) {
		Map<String, String> response = new HashMap<String, String>();
		productService.updateProduct(id, product);
		response.put("status", "success");
		return "redirect:list";
	}

	@PostMapping("/delete")
	@ResponseBody
	public Map<String, String> batchDeleteProduct(@RequestParam(value = "itemIds[]") List<Integer> productIds) {
		Map<String, String> response = new HashMap<String, String>();
		boolean status = productService.deleteProducts(productIds);
		System.out.println(status);
		response.put("status", status ? "success" : "failed");
		return response;
	}

	@GetMapping("/list")
	public String productList(ModelMap model) {
		model.addAttribute("product_types", getAllProductType());
		model.addAttribute("product_list", productService.findAllProduct());
		model.addAttribute("product_type_names_map", productTypeService.getNameMapWithIdFromProductTypeList(getAllProductType()));
		model.addAttribute("category_names_map", categoryService.getNameMapWithIdFromCategoryList(categoryService.findAllCategory()));
		return "products";
	}

	private List<ProductType> getAllProductType() {
		return productTypeService.findAllProductType();
	}
}
