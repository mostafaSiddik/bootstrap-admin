package com.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

	@Query("SELECT cat.name FROM categories cat WHERE cat.id = :id AND cat.is_deleted = 0")
	public String getCategoryName(@Param("id") Integer id);

	@Query("SELECT cat.name FROM categories cat WHERE cat.is_deleted = 0")
	public List<String> getCategoryNames();

	@Query("SELECT cat.name FROM categories cat WHERE cat.product_type_id = :prdtid AND cat.is_deleted = 0")
	public List<String> getCategoryNamesByProductTypeId(@Param("prdtid") Integer productTypeId);

	@Query("SELECT cat FROM categories cat WHERE cat.product_type_id = :prdtid AND cat.is_deleted = 0")
	public List<Category> getAllCategoryByProductTypeId(@Param("prdtid") Integer productTypeId);

}
