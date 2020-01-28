package com.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.Unit;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Integer> {

	@Query("SELECT un.name FROM units un WHERE un.id = :id AND un.is_deleted = 0")
	public String getUnitName(@Param("id") Integer id);

	@Query("SELECT un.name FROM units un WHERE un.is_deleted = 0")
	public List<String> getUnitNames();
}
