package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.Designation;

@Repository
public interface DesignationRepository extends JpaRepository<Designation, Integer> {

	@Query("SELECT dgn.title from designations dgn WHERE dgn.id = :id")
	public String getDesignationTitle(@Param("id") Integer id);

	@Query("SELECT dgn.short_title from designations dgn WHERE dgn.id = :id")
	public String getDesignationShortTitle(@Param("id") Integer id);
}
