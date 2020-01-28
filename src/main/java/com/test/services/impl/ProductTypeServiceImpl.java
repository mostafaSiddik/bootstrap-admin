package com.test.services.impl;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
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

	public ProductType updateProductType(Integer id, ProductType productType) {
		ProductType prdType = findProductType(id);

		prdType.setName(productType.getName());
		prdType.setCode(productType.getCode());
		prdType.setDescription(productType.getDescription());
		prdType.setModified_by(0000);
		prdType.setModified_date(getCurrentDate());
		prdType.setIs_deleted(false);

		return productTypeRepository.save(prdType);
	}

	public boolean deleteProductTypes(List<Integer> productTypeIds) {
		try {
			productTypeIds.stream().forEach(id -> {
				ProductType productType = findProductType(id);

				productType.setModified_by(0000);
				productType.setModified_date(getCurrentDate());
				productType.setIs_deleted(true);

				productTypeRepository.save(productType);
			});
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	public String getProductTypeName(Integer id) {
		return productTypeRepository.getProductTypeName(id);
	}

	public List<String> getAllProductTypeName() {
		return productTypeRepository.getAllProductTypeName();
	}

	public ProductType findProductType(Integer id) {
		Optional<ProductType> productType = productTypeRepository.findById(id);

		return productType.isPresent() ? productType.get() : null;
	}

	public List<ProductType> findAllProductType() {
		return productTypeRepository.findAll().stream().filter(productType -> !productType.isIs_deleted())
				.sorted(Comparator.comparing(ProductType::getName)).collect(Collectors.toList());
	}

	@Override
	public Map<Integer, String> getNameMapWithIdFromProductTypeList(List<ProductType> productTypes) {
		return productTypes.stream().collect(Collectors.toMap(ProductType::getId, ProductType::getName));
	}

	private Date getCurrentDate() {
		return new Date();
	}
}
