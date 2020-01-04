package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.PurchaseRequisitionItems;

@Repository
public interface PurchaseRequisitionItemsRepository extends JpaRepository<PurchaseRequisitionItems, Integer> {

}
