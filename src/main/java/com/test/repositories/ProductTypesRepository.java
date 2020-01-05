package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.ProductType;

@Repository
public interface ProductTypesRepository extends JpaRepository<ProductType, Integer> {

}
