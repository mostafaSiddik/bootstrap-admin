package com.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.Size;

@Repository
public interface SizeRepository extends JpaRepository<Size, Integer> {

	@Query("SELECT sz.name FROM sizes sz WHERE sz.id = :id AND sz.is_deleted = 0")
	public String getSizeName(@Param("id") Integer id);

	@Query("SELECT sz.name FROM sizes sz WHERE sz.is_deleted = 0")
	public List<String> getSizeNames();

}
