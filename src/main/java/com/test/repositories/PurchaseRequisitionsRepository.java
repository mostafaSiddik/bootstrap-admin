package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.PurchaseRequisitions;

@Repository
public interface PurchaseRequisitionsRepository extends JpaRepository<PurchaseRequisitions, Integer> {

}