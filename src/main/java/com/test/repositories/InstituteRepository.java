package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.Institute;

@Repository
public interface InstituteRepository extends JpaRepository<Institute, Integer> {

	@Query("SELECT ins.name FROM institutes ins WHERE ins.id = :id")
	public String getInstituteName(@Param("id") Integer id);
}
