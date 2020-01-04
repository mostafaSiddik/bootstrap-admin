package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.StockEntry;

@Repository
public interface StockEntryRepository extends JpaRepository<StockEntry, Integer> {

}
