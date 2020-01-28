package com.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.Factory;

@Repository
public interface FactoryRepository extends JpaRepository<Factory, Integer> {

	@Query("SELECT fact.name FROM factories fact WHERE fact.id = :id")
	public String getFactoryName(@Param("id") Integer id);

	@Query("SELECT fact.name FROM factories fact")
	public List<String> getAllFactoryName();

}
