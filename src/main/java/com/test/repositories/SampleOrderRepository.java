package com.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.SampleOrder;

@Repository
public interface SampleOrderRepository extends JpaRepository<SampleOrder, Integer> {

	@Query("SELECT smor.order_no FROM sample_orders smor WHERE smor.id = :id AND smor.is_deleted = 0")
	public String getSampleOrderNumber(@Param("id") Integer id);

	@Query("SELECT smor.order_no FROM sample_orders smor WHERE smor.is_deleted = 0")
	public List<String> getAllSampleOrderNumber();
}
