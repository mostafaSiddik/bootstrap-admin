package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.SampleRequisition;

@Repository
public interface SampleRequisitionRepository extends JpaRepository<SampleRequisition, Integer> {

	@Query("SELECT smr.id FROM sample_requisitions smr WHERE smr.sample_order_id = :smor_id")
	public String getSampleRequisitionId(@Param("smor_id") Integer sample_order_id);

}
