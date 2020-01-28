package com.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.JobOrder;

@Repository
public interface JobOrderRepository extends JpaRepository<JobOrder, Integer> {

	@Query("SELECT jbor.order_no FROM job_orders jbor WHERE jbor.id = :id AND jbor.is_deleted = 0")
	public String getJobOrderNumber(@Param("id") Integer id);

	@Query("SELECT jbor.order_no FROM job_orders jbor WHERE jbor.is_deleted = 0")
	public List<String> getAllJobOrderNumber();
}
