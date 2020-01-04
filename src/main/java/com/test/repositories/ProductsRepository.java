package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {

}
