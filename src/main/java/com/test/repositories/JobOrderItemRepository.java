package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.JobOrderItem;

@Repository
public interface JobOrderItemRepository extends JpaRepository<JobOrderItem, Integer> {

	@Query("SELECT jbori.id FROM job_order_items jbori WHERE jbori.job_order_id = :jbor_id")
	public String getJobOrderItemId(@Param("jbor_id") Integer job_order_id);
}
