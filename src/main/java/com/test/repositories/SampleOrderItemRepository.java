package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.SampleOrderItem;

@Repository
public interface SampleOrderItemRepository extends JpaRepository<SampleOrderItem, Integer> {

	@Query("SELECT smori.id FROM sample_order_items smori WHERE smori.sample_order_id = :smor_id")
	public String getSampleOrderItemId(@Param("smor_id") Integer sample_order_id);

}
