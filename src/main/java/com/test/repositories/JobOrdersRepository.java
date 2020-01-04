package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.JobOrders;

@Repository
public interface JobOrdersRepository extends JpaRepository<JobOrders, Integer> {

}
