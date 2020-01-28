package com.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.SampleOrderItem;

@Repository
public interface SampleOrderItemRepository extends JpaRepository<SampleOrderItem, Integer> {

	@Query("SELECT smoritem FROM sample_order_items smoritem WHERE smoritem.sample_order_id = :sampleOrderId")
	public List<SampleOrderItem> getSampleOrderItemsBySampleOrderId(@Param("sampleOrderId") Integer sampleOrderId);
}
