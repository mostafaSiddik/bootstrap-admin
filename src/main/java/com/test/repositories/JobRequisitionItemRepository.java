package com.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.JobRequisitionItem;

@Repository
public interface JobRequisitionItemRepository extends JpaRepository<JobRequisitionItem, Integer> {

	@Query("SELECT jbri FROM job_requisition_items jbri WHERE jbri.job_requisition_id = :jbrq_id")
	public List<JobRequisitionItem> getJobRequisitionItemsByJobRequisitionId(@Param("jbrq_id") Integer jobRequisitionId);
}
