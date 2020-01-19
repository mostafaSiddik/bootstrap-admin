package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.ContactInfo;

@Repository
public interface ContactInfoRepository extends JpaRepository<ContactInfo, Integer> {

	@Query("SELECT cnf.id from contact_info cnf WHERE cnf.employee_id = :emp_id")
	public Integer getContactInfoId(@Param("emp_id") Integer employee_id);
}
