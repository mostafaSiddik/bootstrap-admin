package com.test.my_packages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.my_packages.models.Product;
import com.test.my_packages.services.ProductService;

@Controller
@RequestMapping("/products")
public class ProductsController {

	@Autowired
	ProductService productService;

	@GetMapping
	public String productList(Model model) {
		List<Product> products = productService.findAllProducts();

		model.addAttribute("products", products);

		return "products";
	}

	@PostMapping("/new")
	public Product newProduct(Product product) {
		product = productService.createProduct(product);
		return product;
	}

	@PostMapping("/update")
	public Product updateProduct(Product product) {
		product = productService.updateProduct(product);
		return product;
	}

	@DeleteMapping
	public boolean deleteProduct(int productId) {
		boolean flag;
		try {
			flag = productService.deleteProduct(productId);
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}
}
