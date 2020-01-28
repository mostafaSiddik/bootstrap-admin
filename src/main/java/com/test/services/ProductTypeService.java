package com.test.services;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.test.models.ProductType;

@Service
public interface ProductTypeService {

	public ProductType createProductType(ProductType productType);

	public ProductType updateProductType(Integer id, ProductType productType);

	public boolean deleteProductTypes(List<Integer> productTypeIds);

	public String getProductTypeName(Integer id);

	public List<String> getAllProductTypeName();

	public ProductType findProductType(Integer id);

	public List<ProductType> findAllProductType();

	public Map<Integer, String> getNameMapWithIdFromProductTypeList(List<ProductType> productTypes);
}
