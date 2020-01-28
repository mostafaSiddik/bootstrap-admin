package com.test.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.models.Product;
import com.test.repositories.ProductRepository;
import com.test.services.ProductService;

@Component
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {
		product.setCreated_by(0000);
		product.setCreated_date(getCurrentDate());
		product.setIs_deleted(false);

		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Integer id, Product product) {
		Product prd = findProduct(id);

		prd.setProduct_type_id(product.getProduct_type_id());
		prd.setCategory_id(product.getCategory_id());
		prd.setName(product.getName());
		prd.setCode(product.getCode());
		prd.setDescription(product.getDescription());
		prd.setModified_by(0000);
		prd.setModified_date(getCurrentDate());
		prd.setIs_deleted(false);

		return productRepository.save(prd);
	}

	@Override
	public boolean deleteProducts(List<Integer> productIds) {
		try {
			productIds.stream().forEach(id -> {
				Product product = findProduct(id);

				product.setModified_by(0000);
				product.setModified_date(getCurrentDate());
				product.setIs_deleted(true);

				productRepository.save(product);
			});
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public String getProductName(Integer id) {
		return productRepository.getProductName(id);
	}

	@Override
	public List<String> getAllProductName() {
		return productRepository.getAllProductName();
	}

	@Override
	public Product findProduct(Integer id) {
		Optional<Product> product = productRepository.findById(id);

		return product.isPresent() ? product.get() : null;
	}

	@Override
	public List<Product> findAllProduct() {
		return productRepository.findAll().stream().filter(product -> !product.isIs_deleted())
				.collect(Collectors.toList());
	}

	private Date getCurrentDate() {
		return new Date();
	}

}
