package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.Size;

@Repository
public interface SizeRepository extends JpaRepository<Size, Integer> {

	@Query("SELECT sz.name FROM sizes sz WHERE sz.id = :id")
	public String getDepartName(@Param("id") Integer id);

}
