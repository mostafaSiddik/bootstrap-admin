package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.SampleRequisitionItem;

@Repository
public interface SampleRequisitionItemsRepository extends JpaRepository<SampleRequisitionItem, Integer> {

	@Query("SELECT smrqi.id FROM sample_requisition_items smrqi WHERE smrqi.sample_requisition_id = :smrq_id")
	public String getSampleRequisitionItemId(@Param("smrq_id") Integer sample_requisition_id);

}
