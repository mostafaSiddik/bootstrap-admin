package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.CompanyLocation;

@Repository
public interface CompanyLocationRepository extends JpaRepository<CompanyLocation, Integer> {
	
	@Query("SELECT cmpl.id from company_location cmpl WHERE cmpl.company_id = :cmp_id")
	public Integer getCompanyLocationId(@Param("cmp_id") Integer company_id);
}
