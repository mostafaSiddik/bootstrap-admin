package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.Pension;

@Repository
public interface PensionRepository extends JpaRepository<Pension, Integer> {

}
