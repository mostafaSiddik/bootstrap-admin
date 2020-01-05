package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.Stock;

@Repository
public interface StocksRepository extends JpaRepository<Stock, Integer> {

}
