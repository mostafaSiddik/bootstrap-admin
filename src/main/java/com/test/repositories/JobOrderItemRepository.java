package com.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.JobOrderItem;

@Repository
public interface JobOrderItemRepository extends JpaRepository<JobOrderItem, Integer> {

	@Query("SELECT jboritem FROM job_order_items jboritem WHERE jboritem.job_order_id = :jobOrderId")
	public List<JobOrderItem> getJobOrderItemsByJobOrderId(@Param("jobOrderId") Integer jobOrderId);
}
