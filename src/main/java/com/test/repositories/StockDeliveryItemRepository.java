package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.StockDeliveryItem;

@Repository
public interface StockDeliveryItemRepository extends JpaRepository<StockDeliveryItem, Integer> {

}
