package com.test.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.models.ProductType;
import com.test.services.ProductTypeService;

@Controller
@RequestMapping("/producttype")
public class ProductTypeConroller {

	@Autowired
	private ProductTypeService productTypeService;

	@GetMapping
	public String newProductType(ModelMap model) {
		ProductType productType = new ProductType();
		model.addAttribute("product_type", productType);
		return "product_type";
	}

	@PostMapping
	public String newProductType(ProductType productType, ModelMap map) {
		Map<String, String> response = new HashMap<String, String>();
		productTypeService.createProductType(productType);
		response.put("status", "success");
		return "redirect:producttype/list";
	}

	@GetMapping("/list")
	public String productTypeList(ModelMap map) {
		map.addAttribute("product_type_list", productTypeService.findAllProductType());
		return "product_types";
	}

}
