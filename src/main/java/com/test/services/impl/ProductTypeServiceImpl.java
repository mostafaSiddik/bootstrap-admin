package com.test.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.models.ProductType;
import com.test.repositories.ProductTypeRepository;
import com.test.services.ProductTypeService;

@Component
public class ProductTypeServiceImpl implements ProductTypeService {

	@Autowired
	private ProductTypeRepository productTypeRepository;

	public ProductType createProductType(ProductType productType) {
		productType.setCreated_by(0000);
		productType.setCreated_date(getCurrentDate());
		productType.setIs_deleted(false);
		return productTypeRepository.save(productType);
	}

	public ProductType updateProductType(ProductType productType) {
		return productTypeRepository.save(productType);
	}

	public String getProductTypeName(Integer id) {
		return productTypeRepository.getProductTypeName(id);
	}

	public ArrayList<String> getAllProductTypeName() {
		return productTypeRepository.getAllProductTypeName();
	}

	public Optional<ProductType> findProductType(Integer id) {
		return productTypeRepository.findById(id);
	}

	public List<ProductType> findAllProductType() {
		return productTypeRepository.findAll().stream().filter(productType -> !productType.isIs_deleted())
				.collect(Collectors.toList());
	}

	private Date getCurrentDate() {
		return new Date();
	}
}
