package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.Units;

@Repository
public interface UnitsRepository extends JpaRepository<Units, Integer> {

}
