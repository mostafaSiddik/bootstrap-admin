package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.Promotion;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Integer> {

}
