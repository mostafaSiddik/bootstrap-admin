package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.JobOrder;

@Repository
public interface JobOrderRepository extends JpaRepository<JobOrder, Integer> {
	
	@Query("SELECT jbor.id FROM job_orders jbor WHERE jbor.sample_order_id = :smdor_id")
	public String getJobOrderId(@Param("smdor_id") Integer sample_order_id);

}
