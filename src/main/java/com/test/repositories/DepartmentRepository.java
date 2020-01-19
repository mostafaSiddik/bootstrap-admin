package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	@Query("SELECT dpt.name FROM departments dpt WHERE dpt.id = :id")
	public String getDepartName(@Param("id") Integer id);

}
