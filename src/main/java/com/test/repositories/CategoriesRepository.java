package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.Categories;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer> {

}
