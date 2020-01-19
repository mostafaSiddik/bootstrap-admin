package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.PurchaseRequisitionItem;

@Repository
public interface PurchaseRequisitionItemRepository extends JpaRepository<PurchaseRequisitionItem, Integer> {

	@Query("SELECT prcrqi.id FROM purchase_requisition_items prcrqi WHERE prcrqi.purchase_requisition_id = :prcrq_id")
	public String getPurchaseRequisitionItemId(@Param("prcrq_id") Integer purchase_requisition_id);

}
