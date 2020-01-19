package com.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {
	
	@Query("SELECT br.name FROM branch br WHERE br.id= :id")
	public String getBranchName(@Param("id") Integer id);

	@Query("SELECT br.name FROM branch br WHERE br.company_id= :com_id")
	public List<String> getBranchNames(@Param("com_id") Integer company_id);
}
