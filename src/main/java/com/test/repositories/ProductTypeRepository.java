package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.ProductType;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, Integer> {
	
	@Query("SELECT pdtp.name FROM product_types pdtp WHERE pdtp.id = :id")
	public String getProductTypeName(@Param("id") Integer id);

}
