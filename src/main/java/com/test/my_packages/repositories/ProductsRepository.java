package com.test.my_packages.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.my_packages.models.Product;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Integer>{

	@Query("SELECT p FROM products p WHERE p.productName = :productName AND p.productCategory = :productCategory")
	public Optional<Product> findProductByNameAndCategory(@Param("productName") String productName, @Param("productCategory") String category);

	@Query("SELECT p FROM products p WHERE p.productCategory = :productCategory")
	public List<Product> findProductsByCategory(@Param("productCategory") String productCategory);
}
