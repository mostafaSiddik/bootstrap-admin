package com.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query("SELECT pdt.name FROM products pdt WHERE pdt.id = :id AND pdt.is_deleted = 0")
	public String getProductName(@Param("id") Integer id);

	@Query("SELECT pdt.name FROM products pdt WHERE pdt.is_deleted = 0")
	public List<String> getAllProductName();

}
