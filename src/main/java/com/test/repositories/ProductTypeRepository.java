package com.test.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.ProductType;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, Integer> {

	@Query("SELECT pdtp.name FROM product_types pdtp WHERE pdtp.id = :id AND pdtp.is_deleted = 0")
	public String getProductTypeName(@Param("id") Integer id);

	@Query("SELECT pdtp.name FROM product_types pdtp WHERE pdtp.is_deleted = 0")
	public ArrayList<String> getAllProductTypeName();

}
