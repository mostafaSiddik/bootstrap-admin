package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.EmployeeLocation;

@Repository
public interface EmployeeLocationRepository extends JpaRepository<EmployeeLocation, Integer> {

	@Query("SELECT empl.id from employee_locations empl WHERE empl.employee_id = :emp_id")
	public Integer getEmployeeLocationId(@Param("emp_id") Integer employee_id);

}
