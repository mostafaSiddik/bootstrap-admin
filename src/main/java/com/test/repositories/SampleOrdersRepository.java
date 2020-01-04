package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.SampleOrders;

@Repository
public interface SampleOrdersRepository extends JpaRepository<SampleOrders, Integer> {

}
