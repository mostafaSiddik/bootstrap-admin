package com.test.my_packages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.my_packages.models.Product;

@Service
public interface ProductService {

	public Product findProductById(int id);
	
	public Product findProductByNameAndCategory(String productName, String category);
	
	public List<Product> findProductsByCategory(String productCategory);
	
	public List<Product> findAllProducts();
	
	public Product createProduct(Product product);
	
	public Product updateProduct(Product product);
	
	public boolean deleteProduct(int productId) throws Exception;
}
