package com.test.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.models.Product;

@Service
public interface ProductService {

	public Product createProduct(Product product);

	public Product updateProduct(Integer id, Product product);

	public boolean deleteProducts(List<Integer> productIds);

	public String getProductName(Integer id);

	public List<String> getAllProductName();

	public Product findProduct(Integer id);

	public List<Product> findAllProduct();
}
