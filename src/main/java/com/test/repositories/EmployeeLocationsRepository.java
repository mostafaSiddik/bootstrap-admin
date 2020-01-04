package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.EmployeeLocations;

@Repository
public interface EmployeeLocationsRepository extends JpaRepository<EmployeeLocations, Integer> {

}
