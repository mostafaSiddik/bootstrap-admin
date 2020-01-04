package com.test.my_packages.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.my_packages.models.Product;
import com.test.my_packages.repositories.ProductsRepository;
import com.test.my_packages.services.ProductService;

@Component
public class ProductsServiceImpl implements ProductService {

	@Autowired
	private ProductsRepository productsRepository;

	public Product findProductById(int id) {
		Optional<Product> product = productsRepository.findById(id);
		return product.isPresent() ? product.get() : null;
	}

	public Product findProductByNameAndCategory(String productName, String category) {
		Optional<Product> product = productsRepository.findProductByNameAndCategory(productName, category);
		return product.isPresent() ? product.get() : null;
	}

	public List<Product> findProductsByCategory(String productCategory) {
		List<Product> products = productsRepository.findProductsByCategory(productCategory);
		return products;
	}

	public List<Product> findAllProducts() {
		List<Product> products = productsRepository.findAll();
		return products;
	}

	public Product createProduct(Product product) {
		return productsRepository.save(product);

	}

	public Product updateProduct(Product product) {
		Product dbProduct = productsRepository.getOne(product.getId());
		
		dbProduct.setProductName(product.getProductName());
		dbProduct.setProductCategory(product.getProductCategory());
		return productsRepository.save(dbProduct);
	}

	public boolean deleteProduct(int productId) throws Exception {
		try {
			productsRepository.deleteById(productId);
		} catch (IllegalArgumentException e) {
			throw new Exception(e);
		}
		return true;
	}
}
