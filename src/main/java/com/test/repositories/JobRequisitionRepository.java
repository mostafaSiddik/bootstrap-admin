package com.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.JobRequisition;

@Repository
public interface JobRequisitionRepository extends JpaRepository<JobRequisition, Integer> {

	@Query("SELECT jbr FROM job_requisitions jbr WHERE jbr.job_order_id = :jbor_id")
	public List<JobRequisition> getJobRequisitionsByJobOrderId(@Param("jbor_id") Integer job_order_id);
}
