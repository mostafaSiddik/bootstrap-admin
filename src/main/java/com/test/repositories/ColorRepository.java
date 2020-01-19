package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.Color;

@Repository
public interface ColorRepository extends JpaRepository<Color, Integer> {

	@Query("SELECT clr.name from colors clr WHERE clr.id = :id")
	public String getColorName(@Param("id") Integer id);
}
