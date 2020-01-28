package com.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer> {

	@Query("SELECT vnd.name FROM vendors vnd WHERE vnd.id = :id AND vnd.is_deleted = 0")
	public String getVendorName(@Param("id") Integer id);

	@Query("SELECT vnd.name FROM vendors vnd WHERE vnd.is_deleted = 0")
	public List<String> getAllVendorName();

}
