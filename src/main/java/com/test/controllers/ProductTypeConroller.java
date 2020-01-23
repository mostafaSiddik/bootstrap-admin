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
		model.addAttribute("view_mode", "New");
		model.addAttribute("product_type", productType);
		return "product_type";
	}

	@PostMapping
	public String newProductType(ProductType productType, ModelMap map) {
		Map<String, String> response = new HashMap<String, String>();
		productTypeService.createProductType(productType);
		response.put("status", "success");
		return "redirect:list";
	}

	@GetMapping("{id}")
	public String updateProductType(@PathVariable Integer id, ModelMap model) {
		model.addAttribute("view_mode", "Update");
		model.addAttribute("id", id);
		model.addAttribute("product_type", productTypeService.findProductType(id));
		return "product_type";
	}

	@PostMapping("{id}")
	public String updateProductType(@PathVariable Integer id, ProductType productType, ModelMap map) {
		Map<String, String> response = new HashMap<String, String>();
		productTypeService.updateProductType(id, productType);
		response.put("status", "success");
		return "redirect:list";
	}

	@PostMapping("/delete")
	@ResponseBody
	public Map<String, String> batchDeleteProductType(@RequestParam(value = "itemIds[]") List<Integer> productTypeIds) {
		Map<String, String> response = new HashMap<String, String>();
		boolean status = productTypeService.deleteProductTypes(productTypeIds);
		System.out.println(status);
		response.put("status", status ? "success" : "failed");
		return response;
	}

	@GetMapping("/list")
	public String productTypeList(ModelMap map) {
		map.addAttribute("product_type_list", productTypeService.findAllProductType());
		return "product_types";
	}

}
