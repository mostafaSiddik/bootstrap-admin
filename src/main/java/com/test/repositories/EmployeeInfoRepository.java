package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.EmployeeInfo;

@Repository
public interface EmployeeInfoRepository extends JpaRepository<EmployeeInfo, Integer> {

	@Query("SELECT CONCAT(empi.first_name, empi.last_name) as name FROM employee_info empi WHERE empi.id = :id")
	public String getEmployeeName(@Param("id") Integer id);
}
