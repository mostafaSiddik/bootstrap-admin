package com.test.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.test.models.ProductType;

@Service
public interface ProductTypeService {

	public ProductType createProductType(ProductType productType);

	public ProductType updateProductType(ProductType productType);

	public String getProductTypeName(Integer id);

	public ArrayList<String> getAllProductTypeName();

	public Optional<ProductType> findProductType(Integer id);

	public List<ProductType> findAllProductType();

}
